
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EmployeeList {
    EmNode head, tail;
    
    
    public EmployeeList(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    
    void clear(){
        head = tail = null;
    }
    
    public void add(Employee p){
        if (isEmpty()) head = tail = new EmNode(null, p);
        else{
            EmNode q = new EmNode(null, p);
            tail.next = q;
            tail = q;
        }
            
    }
    
    public EmNode search(String code){
        EmNode q = head;
        while (q != null){
            if (q.employee.getCode().equals(code)){
                return q;
            }
            q = q.next;
        }
        return null;
    }
    
    public void deleteAfter(EmNode p) {
        EmNode q = p.next;
        p.next = q.next;
    }

    void dele(String code) {
        EmNode q = search(code);
        EmNode p = head;
        while (p.next != q) {
            p = p.next;
        }
        deleteAfter(p);
    }
    int count() {
        int c = 0;
        EmNode p = head;
        while (p.next != null) {
            p = p.next;
            c++;
        }
        c++;
        return c;
    }
    
    
    EmNode node(int i){
        int index = 0;
        EmNode q = head;
        while (index != i){
            q = q.next;
            index++;
        }
        return q;
    }
    
    void sort(){
        int i = 0;
        int j = 0;
        EmNode swap = new EmNode();
        EmNode hold = new EmNode();
        EmNode after = new EmNode();
        try {
        for (i = this.count(); i > 0; i--) {
            for (j = 0; j < i-1; j++) {
                  
                    if (node(j).employee.getCode().compareTo(node(j+1).employee.getCode()) > 0){
                        if ( j == 0){
                            after = node(j+1).next;
                            hold = head;
                            head = node(j+1);
                            node(j).next = hold;
                            node(j+1).next = after;
                        }
                        else {
                        hold = node(j-1).next;
                        swap = node(j+1);
                        after = node(j+1).next;
                        if (j > 0)
                            node(j-1).next = swap;
                        node(j).next = hold;
                        node(j+1).next = after;

                        head = node(0);
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("i, j = " + i + "," + j);
            }
        }  
    
    public void inputFromFile(String filename){
        
        int index = 0;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader bf = new BufferedReader(fr);
            int c;
            String code = "";
            String name = "";
            String sex  = "";
            String salaryStr = "";
            double salary = 0;
            String bonusStr = "";
            double bonus = 0;
            String incomeStr = "";
            double income = 0;
            
            while((c=bf.read()) != -1){
                char b = (char)c;
               
                if(index == 0){

                    if(b == '|'){
                        index++;
                        continue;
                    }
                    else
                        code += b;
                }
                if(index == 1){
                    
                    if(b == '|'){
                        index++;
                        continue;
                    }
                    else
                        name += b;
                }
                if (index == 2){
                    if (b == '|'){
                        index++;
                        continue;
                    }
                    else
                        sex += b;
                }
                if (index == 3){
                    if (b == '|'){
                        index++;
                        continue;
                    }
                    else 
                        salaryStr += b;
                }
                if (index == 4){
                    if (b == '|'){
                        index++;
                        continue;
                    }
                    else
                        bonusStr += b;
                }
                
                if (index == 5){
                    
                    
                    if (b == '\n'){
                        salary = Double.parseDouble(salaryStr);
                        bonus = Double.parseDouble(bonusStr);
                        income = Double.parseDouble(incomeStr);
                        this.add(new Employee(code,name,sex,salary,bonus,income));
                        index = 0;
                        code = "";
                        name = "";
                        sex = "";
                        salaryStr = "";
                        salary = 0;
                        bonusStr= "";
                        bonus = 0;
                        incomeStr = "";
                        income = 0;
                    }
                    else
                        incomeStr += b;
                }
                
            }
            bf.close();
            fr.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Unable to open file " + "'" + filename + "'");
        }
        catch (IOException ex){
            System.out.println("Error reading file '" + "'");
        }
    }
    
      public void saveToFile(String filename){
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            EmNode q = head;
            while (q != null){
                bw.write(q.employee.getCode());
                bw.write('|');
                bw.write(q.employee.getName());
                bw.write('|');
                bw.write(q.employee.getSex());
                bw.write('|');
                String salary = ""+q.employee.getSalary();
                bw.write(salary);
                bw.write('|');
                String bonus = ""+q.employee.getBonus();
                bw.write(bonus);
                bw.write('|');
                String income = "" +q.employee.getIncome();
                bw.write(income);
                bw.newLine();
                q = q.next;
            }
            bw.close();
            fw.close();
        } catch (IOException ex){
            System.out.println("Error writing to file '" + filename + "'");
        }
    }
      
      public void traverse() {
        EmNode a = head;
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        while (a != null) {
            System.out.println(a.employee.getCode());
            a = a.next;
        }
    }
    
}
