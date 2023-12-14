package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String s = "";
        if(cathetusLength!=0) {

            for (int i = 1; i <= cathetusLength; i++) {
                for (int j = 1; j <= cathetusLength; j++) {
                    if (i + j >= cathetusLength + 1) {
                        s = s + "*";
                    } else {
                        s = s + " ";
                    }
                }
                s = s + '\n';
            }
        }
        s=s.stripTrailing();
        s=s.stripIndent();
        System.out.println(s);
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
