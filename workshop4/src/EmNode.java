/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EmNode {
    Employee employee;
    EmNode next;
    
    public EmNode(){}
    public EmNode(EmNode next, Employee employee){
        this.employee = employee;
        this.next = next;
    }
}
