import java.awt.*;

/**
 * Title      :Cat.java
 * Description:This class contains the definition of a cat. 
 * Copyright  :Copyright (c) 2006‐2021
 * @author Laurissa Tokarchuk
 * @version 1.0
 * @author Paula Fonseca
 * @version 1.4
 */
public class Cat {
    // Declaration of instance variables.
    int speed;
    String name, furType;
    boolean tail;
    Color colour;
    /**
     * Using this method to constract cat object with each attribute ***** TRY ARRAYLIST ***** 构造方法 
     * @param name
     * @param furType
     * @param colour
     * @param speed
     */
    //for lab3
    // public Cat(String name, String furType, Color colour, int speed){
    //     this.name = name;
    //     this.furType = furType;
    //     this.colour = colour;
    //     this.speed = speed;
    // }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSpeed(){
        return speed;
    }
    public void setAge(int speed){ 
        this.speed = speed; 
    }

    /** This method is about the details of the cat, problem3!!!!
     * @param name,  @param furType;
     * @param tail;
     * @param colour;
     */
    public void details(String name, String furType, boolean tail, Color colour) {
        System.out.println("My name is " + name);
        System.out.println("My color is " + colour);
    }

    /** This is the sleep method for the cat. It dictates the number of * minutes the cat sleeps.
    * @param duration The number of minutes to sleep.
    */
    public void sleep(int duration) {
        System.out.println("I am sleeping for " + duration + " minutes.");
    }
    /** This method allows the cat to run. The distance (in a straight line)
    * the cat runs is dependent on how long the cat runs and whether or not
    * it is running in a zigzag.
    * @param duration The number of minutes to run.
    * @param zigzag Whether to run in a zigzag pattern.
    * @return int Number of metres ran. */
    public int run(int duration, boolean zigzag) { 
        System.out.println("I am running "
        + (zigzag? "in a zigzag" : "straight") + " for "
        + duration+ " minutes.");
        int distanceRun = duration * speed; // assuming speed is metres per minute
        if (zigzag) {
        /* When in zigzag, distance is 1/3 of what it would have been if
        the cat was going straight. */ 
            return distanceRun/3;
        }
        else return distanceRun;
    }

    @Override
    public String toString() {
        return "My name is " + name + ", my furType is " + furType + ", my color is " + colour + ", my speed is " + speed;
    }

}
