package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        int a=first^second;
        first=a^first;
        second=a^second;
        System.out.println(first);
        System.out.println(second);
    }

}
