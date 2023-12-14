package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int product=1;
        while (power>0){
            product=product*numberToPrint;
            power--;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
