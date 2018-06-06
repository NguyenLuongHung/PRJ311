/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        EmployeeList c = new EmployeeList();
        Employee a = new Employee("B01","Hung","Male",1000,20,1020);
        
        c.inputFromFile("employee.txt");

       c.saveToFile("saveEmployee.txt");
        c.dele("B02");
        c.saveToFile("saveEmployee.txt");
        c.traverse();
    }
}
