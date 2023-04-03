/*
William Denny
IDE Project 2
CSC 222-M1 Spring 23
Manin.java
Gas/Electric vehicle comparison using OOP principles
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Electric vs Gas Car Modeling App - OOP Version");
        System.out.println("You will need to enter details about gas costs, diesel cost, and electricity costs and how many miles you drive weekly.");
        System.out.println("******************");
        System.out.println("How much is gas per gallon?: ");
        Double gasCost = input.nextDouble();
        System.out.println("How much is diesel per gallon?: ");
        Double dieselCost = input.nextDouble();
        System.out.println("How much is electricity per mile?");
        Double electricityPerMile = input.nextDouble();
        System.out.println("How many miles on average do you drive per week? ");
        Double milesWeekly = input.nextDouble();
        System.out.println("***** Calculation Results *****");
        float weeksInMonth = 4.3f;
        Double milesMonthly = weeksInMonth * milesWeekly;
        Gas car1 = new Gas("2023 Kia Forte:", 402.00, 33.5);
        car1.setTotalMonthlyCost(milesMonthly, gasCost);
        Electric car2 = new Electric("2023 Nissan ARIYA:", 849.00);
        car2.setTotalEMonthlyCost(milesMonthly, electricityPerMile);
        Gas car3 = new Gas("2023 Toyota Corolla:", 402.00, 37.5);
        car3.setTotalMonthlyCost(milesMonthly, gasCost);
        Diesel car4 = new Diesel("2023 RAM 1500:", 1323.00, 21.50);
        car4.setTotalDMonthlyCost(milesMonthly, dieselCost);
        Electric car5 = new Electric("2021 Porsche Taycan:", 2856.00);
        car5.setTotalEMonthlyCost(milesMonthly, electricityPerMile);
        Electric car6 = new Electric("2022 Mercedes-Benz EQS:", 2332.00);
        car6.setTotalEMonthlyCost(milesMonthly, electricityPerMile);
        Gas car7 = new Gas("2023 Toyota Crown:", 990.00, 41.5);
        car7.setTotalMonthlyCost(milesMonthly, gasCost);
        Diesel car8 = new Diesel("2023 GMC Sierra 1500HD:", 1137.00, 18.50);
        car8.setTotalDMonthlyCost(milesMonthly, dieselCost);
        Diesel car9 = new Diesel("2021 Chevrolet Suburban:", 1321.00, 17.00);
        car9.setTotalDMonthlyCost(milesMonthly, dieselCost);




        System.out.println(car1.getName() + " Total Monthly Costs: $" + String.format("%.2f", car1.getTotalMonthlyCost()));
        System.out.println(car2.getName() + " Total Monthly Costs: $" + String.format("%.2f", car2.getTotalEMonthlyCost()));
        System.out.println(car3.getName() + " Total Monthly Costs: $" + String.format("%.2f", car3.getTotalMonthlyCost()));
        System.out.println(car4.getName() + " Total Monthly Costs: $" + String.format("%.2f", car4.getTotalDMonthlyCost()));
        System.out.println(car5.getName() + " Total Monthly Costs: $" + String.format("%.2f", car5.getTotalEMonthlyCost()));
        System.out.println(car6.getName() + " Total Monthly Costs: $" + String.format("%.2f", car6.getTotalEMonthlyCost()));
        System.out.println(car7.getName() + " Total Monthly Costs: $" + String.format("%.2f", car7.getTotalMonthlyCost()));
        System.out.println(car8.getName() + " Total Monthly Costs: $" + String.format("%.2f", car8.getTotalDMonthlyCost()));
        System.out.println(car9.getName() + " Total Monthly Costs: $" + String.format("%.2f", car9.getTotalDMonthlyCost()));




        //System.out.println(car1.toString());

        //System.out.println("Here is the car name for car1: " + car1.getName());
        //System.out.println("Here is the car name for car2: " + car2.getName());
        //more testing for our gas class objects


        //car1.getTotalMonthlyCost(555.51);
        //System.out.println(car1.getFinancePayment());










    }
}