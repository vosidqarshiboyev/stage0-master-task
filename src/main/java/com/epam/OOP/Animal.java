package com.epam.OOP;

public class Animal {
    private String color;

    public String getColor() {
        return color;
    }
    public int getNumberOfPaws() {
        return numberOfPaws;
    }
    public boolean isHasFur() {
        return hasFur;
    }
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color,int numberOfPaws,boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }
    public String getDescription(){
        String flag= (this.hasFur)?"a":"no";
        String paw=(this.numberOfPaws>1)?"paws":"paw";
        return String.format("This animal is mostly %s. It has %d %s and %s fur.",this.color,this.numberOfPaws,paw,flag);
    }

}
