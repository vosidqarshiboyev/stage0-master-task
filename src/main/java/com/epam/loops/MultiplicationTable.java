package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        String s="";
        for (int i=1;i<=10;i++){
            s=s+(String.format("%d x %d = %d\n",i,numberTableToPrint,numberTableToPrint*i));
        }
        s=s.strip();
        System.out.println(s);
    }
}
