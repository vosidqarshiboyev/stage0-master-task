package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int copy=number;
        int sum=0;
        while(copy>0){
            int remainder=copy%10;
            copy=copy/10;
            sum=sum+remainder;
        }
        System.out.println(sum);
    }

}
