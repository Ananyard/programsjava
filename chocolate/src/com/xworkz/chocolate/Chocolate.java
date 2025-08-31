package com.xworkz.chocolate;

public class Chocolate {
    public String type;


    public String getType() {
        return type;
    }

    public void assignTypeTo(Chocolate anotherChocolate) {
        anotherChocolate.type = this.type;
    }
}




