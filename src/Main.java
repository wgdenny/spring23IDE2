/*
William Denny
IDE Project 2
CSC 222-M1 Spring 23
Manin.java
Gas/Electric vehicle comparison using OOP principles
 */

public class Main {
    public static void main(String[] args) {
        Gas car1 = new Gas("Test Car 1", 251.23, 23.5);
        Gas car2 = new Gas("Test Car 2", 293.23, 30.5);

        System.out.println("Here is the car name for car1: " + car1.getName());
        System.out.println("Here is the car name for car2: " + car2.getName());
    }
}