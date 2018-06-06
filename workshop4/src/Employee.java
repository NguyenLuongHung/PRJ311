/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Employee {
    private String code;
    private String name;
    private String sex;
    private double salary;
    private double bonus;
    private double income;
    
    public Employee(){};
    public Employee(String code, String name, String sex, double salary, double bonus, double income){
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.income = income;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    public void setName (String name){
        this.name = name;
        
    }
    public void setSex (String sex){
        this.sex = sex;
    }
    public void setSalary (double salary){
        this.salary = salary;
    }
    public void setBonus (double bonus){
        this.bonus = bonus;
    }
    public void setIncome (double Income){
        this.income = Income;
    }
    
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    
    public String getSex(){
        return this.sex;
    }
    public double getSalary(){
        return this.salary;
    }
    
    public double getBonus(){
        return this.bonus;
    }
    public double getIncome(){
        return this.income;
    }
}
