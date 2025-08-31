package com.xworkz;
import com.xworkz.chocolate.Chocolate;
import com.xworkz.dairymilk.Dairymilk;
public class Runner {
    public static void main(String[] args) {


        System.out.println("Program started");

        // Parent chocolate
        Chocolate chocolate = new Chocolate();
        chocolate.type = "Chocolate";

        // Child chocolates
        Dairymilk dairyMilk1 = new Dairymilk();
        Dairymilk dairyMilk2 = new Dairymilk();
        Dairymilk dairyMilk3 = new Dairymilk();

        // Transfer type from parent to child chocolates
        chocolate.assignTypeTo(dairyMilk1);
        chocolate.assignTypeTo(dairyMilk2);
        chocolate.assignTypeTo(dairyMilk3);

        // Print types using getType()
        System.out.println("Parent chocolate type: " + chocolate.getType());
        System.out.println("DairyMilk1 type: " + dairyMilk1.getType());
        System.out.println("DairyMilk2 type: " + dairyMilk2.getType());
        System.out.println("DairyMilk3 type: " + dairyMilk3.getType());

        System.out.println("Program ended");
    }
}