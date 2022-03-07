import java.awt.*;
/**
* Title : CatTest.java
* Description: This class contains the test class for Cat. * Copyright : Copyright (c) 2006 ‐ 2021
* @author Laurissa Tokarchuk
* @version 1.0
* @author Paula Fonseca
* @version 1.4
*/
public class CatTest {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        // myCat.name = "Napoleon";
        // myCat.furType = "short";
        // myCat.tail = true;
        // myCat.colour = Color.ORANGE;
        myCat.speed = 300; // in metres per minute
        myCat.details("Napoleon", "short", true, Color.ORANGE);
        System.out.println("My speed is " + myCat.speed + " m/s");
        myCat.sleep(5);
        int numMetres = myCat.run(10, true);
        System.out.println("I have run " + numMetres + " metres.");

        Cat cat1 = new Cat();
        cat1.speed = 500;
        cat1.details("Tom", "short", true, Color.BLACK);
        int numMetres2 = cat1.run(10, false);
        System.out.println("I have run " + numMetres2 + " metres.");

        Cat cat2 = new Cat();
        cat1.speed = 500;
        cat1.details("Moggy", "long", false, Color.WHITE);
        cat2.sleep(5);
        int numMetres3 = cat1.run(5, true);
        System.out.println("I have run " + numMetres3 + " metres.");
    }
}