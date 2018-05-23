/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyQueue {
    Node head, tail;
    public MyQueue(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return(head == null);
    }
    void put(Integer info){
        if(isEmpty())
            head = tail = new Node(info,null);
        else {
            Node q = new Node(info, null);
            tail.next = q;
            tail = q;
        }
    }
    Integer get(){
        Integer x = head.info;
        head = head.next;
        return x;
    }
    int getSize(){
        int size = 0;
        Node q = head;
        while(q != null){
            q = q.next;
            size++;
        }
        size++;
        return size;
    }
    void traverse(){
        Node q = head;
        while(q!= null){
            System.out.println(q.info + " ");
            q = q.next;
        }
    }
    public String toString(){
        Node q = head;
        String s = "";
        while(q!= null){
            s += q.info + " ";
            q = q.next;
        }
        s=s.trim();
        return s;
    }
}
