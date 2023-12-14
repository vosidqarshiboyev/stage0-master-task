package com.epam.loops;

import java.util.ArrayList;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if(cathetusLength>0) {
            String word = "";

            for (int i = 1; i <= cathetusLength; i++) {
                int s = i;
                for (int j = 1; j <= cathetusLength * 2 - 1; j++) {

                    if (i + j >= cathetusLength + 1 && j < cathetusLength + i) {
                        for (; s >= 1; s--) {
                            word = word + s;
                            if (s == 1) {
                                for (int b = 2; b <= i; b++) {
                                    word = word + b;
                                }
                            }
                        }

                    } else {
                        word = word + " ";
                    }

                }
                word = word.stripTrailing();
                word = word + '\n';
            }


            word = word.stripTrailing();
            System.out.println(word);
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);



    }

}
