package org.example;

import org.example.List.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList links = new LinkedList("Nó 01");
        links.append("Nó 02");
        links.getHead();
        links.getTail();
        links.getLength();

        System.out.println("\n\n");
        links.print();
        System.out.println("\n");

        links.append("Nó 03");
        links.getHead();
        links.getTail();
        links.getLength();

        System.out.println("\n\n");
        links.print();
        System.out.println("\n");

        System.out.println(links.removeLastNode());
        links.getHead();
        links.getTail();
        links.getLength();

        System.out.println("\n\n");
        links.print();
        System.out.println("\n");

        links.prepand("Nó 00");
        links.getHead();
        links.getTail();
        links.getLength();

        System.out.println("\n\n");
        links.print();
        System.out.println("\n");
    }
}