public class Gas {
    //setup instance variables - what pieces of data does every gas car need


    private String carName;
    private double financePayment;
    private double MPG;
    private Double totalMonthlyCost;


    //constructor
    public Gas(String name, Double payment, Double mileage){

        carName = name;
        financePayment = payment;
        MPG = mileage;

    }//ends our constructor

    //set car name
    public void setName(String name){
        carName = name;
    }//ends setter for name
    //get car name
    public String getName(){
        return carName;
    }//ends our get name

    public void setFinancePayment(Double payment){
        financePayment = payment;
    }
    //getter for finance
    public Double getFinancePayment(){
        return financePayment;
    }//ends get finance

    public void setMPG(Double mileage){
        MPG = mileage;
    }
    //getter for Milage
    public Double getMPG(){
        return MPG;
    }
    //need to do calculations for our monthly cost
    //setTotalMonthlyCost
    public void setTotalMonthlyCost(Double milesMonthly, Double gasCost){
        Double totalCost = this.financePayment + (milesMonthly/this.MPG * gasCost);
        totalMonthlyCost = totalCost;

    }//ends our setTotalMonthlyCost
    //getter
    public Double getTotalMonthlyCost(){
        return totalMonthlyCost;
    }//ends get
    //overide java toString() method
    @Override
    public String toString(){
        return "\n" + carName + " Total Monthly Costs: " + totalMonthlyCost;

    }


}


