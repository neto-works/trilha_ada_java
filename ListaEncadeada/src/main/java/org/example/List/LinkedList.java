package org.example.List;

import org.example.List.Interfaces.ILinkedList;

public class LinkedList implements ILinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        String data;
        Node next;

        public Node(String data){
            this.data = data;
        }
        public String toString(){
            return  this.data;
        }

    }

    public LinkedList(String data){
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;

    }
    public void getHead() {
        if(this.head == null){
            System.out.println("Lista Vazia.");
        }else {
            System.out.println("Head : "+ this.head.toString());
        }
    }
    public void getTail() {
        if(this.tail == null){
            System.out.println("Lista Vazia.");
        }else{
            System.out.println("Tail : "+ this.tail.toString());
        }
    }
    public void getLength() {
        System.out.println("Length: "+this.length);
    }
    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.length=0;
    }
    public void print(){
        Node temp = this.head;
        while(temp != null){
            System.out.print("\t" +temp.data + " -->");
            temp = temp.next;
        }
    }
    public void append(String data){
        Node newNode = new Node(data);
        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else {
            tail.next = newNode;
            tail =newNode;
        }
        this.length++;
    }
    public Node removeLastNode(){
        if (this.length == 0){
            return  null;
        }
        Node pre  = this.head;
        Node temp  = null;
        while(pre.next != this.tail){
            pre = pre.next;
        }
        temp = tail;
        tail = pre;
        tail.next = null;
        this.length--;
        if(this.length == 0){
            this.head = null;
            this.tail =null;
        }
        return  temp;

    }
    public void prepand(String data){
        Node newNode = new Node(data);
        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

}
