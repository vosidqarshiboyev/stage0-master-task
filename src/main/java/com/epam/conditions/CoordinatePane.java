package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if(x!=0 && y!=0) {
            char signx = (x > 0) ? '+' : '-';
            char signy = y > 0 ? '+' : '-';
            String s = signx + "" + signy;
            switch (s) {
                case "++":
                    System.out.println("first");
                    break;
                case "+-":
                    System.out.println("fourth");
                    break;
                case "-+":
                    System.out.println("second");
                    break;
                case "--":
                    System.out.println("third");
            }

        }
        if (x==y && y==0){
            System.out.println("zero");
        }
    }
    public static void main(String[]args){
        CoordinatePane coordinatePane=new CoordinatePane();
        coordinatePane.printQuadrant(4,5);
    }
}

