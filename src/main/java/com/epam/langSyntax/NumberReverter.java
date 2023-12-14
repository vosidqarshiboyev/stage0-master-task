package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int copy=number;
        int sum=0;
        while(copy>0){
            int remainder=copy%10;
            copy=copy/10;
            sum=sum*10+remainder;
        }
        number=sum;
        System.out.println(sum);
    }
}
