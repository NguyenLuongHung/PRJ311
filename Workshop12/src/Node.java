/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Node {
    Integer info;
    Node next;
    public Node(){};
    public Node(Integer info, Node p){
        this.info = info;
        this.next = p;
    }
    
}
