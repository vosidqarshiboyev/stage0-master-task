package com.epam.OOP;

public class Bird extends Animal{

    public Bird(){
        super("blue",2,false);
    }

    @Override
    public String getDescription() {
        String flag=this.isHasFur()?"a":"no";
        return String.format("This animal is mostly %s. It has %d paws and %s fur." +
                " Moreover, it has 2 wings and can fly.",this.getColor(),this.getNumberOfPaws(),flag);
    }
}
