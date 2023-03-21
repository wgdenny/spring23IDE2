/*
William Denny
IDE Project 2
CSC 222-M1 Spring 23
Manin.java
Gas/Electric vehicle comparison using OOP principles
 */

public class Main {
    public static void main(String[] args) {
        Gas car1 = new Gas("Test Car 1", 467.45, 34.5);
        Gas car2 = new Gas("Test Car 2", 583.14, 50.0);

        car1.setTotalMonthlyCost(100.00, 3.12);
        car1.setTotalMonthlyCost(100.00, 3.12);


        System.out.println(car1.toString());
        System.out.println(car2.toString());
        
        //System.out.println(car1.toString());

        System.out.println("Here is the car name for car1: " + car1.getName());
        //System.out.println("Here is the car name for car2: " + car2.getName());
        //more testing for our gas class objects

        car1.setTotalMonthlyCost(890.00, 3.14);
        System.out.println(car1.getTotalMonthlyCost());
        //car1.getTotalMonthlyCost(555.51);
        System.out.println(car1.getFinancePayment());






    }
}