package org.ream;

import org.ream.objects.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();

        linkList.add("Johan");
        linkList.add("Elias");
        linkList.add("Gerson");

        linkList.unShift("Marcos");
        linkList.add("Jesus");

        linkList.remove("Elias");

        linkList.printValues();
    }
}