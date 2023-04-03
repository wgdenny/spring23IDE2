public class Electric {


    private String eCarName;
    private double eFinancePayment;
    private double electricityPerMile;
    private Double totalEMonthlyCost;

    //constructor
    public Electric(String eName, Double ePayment){

        eCarName = eName;
        eFinancePayment = ePayment;

    }//ends constructor
    //set car name
    public void setName(String eName){
        eCarName = eName;
    }//ends setter for name
    //get car name
    public String getName(){
        return eCarName;
    }//ends our get name

    public void setFinancePayment(Double ePayment){
        eFinancePayment = ePayment;
    }
    //getter for finance
    public Double getFinancePayment(){
        return eFinancePayment;
    }//ends get finance


    public void setTotalEMonthlyCost(Double milesMonthly, Double electricityPerMile){
        Double totalECost = this.eFinancePayment + (milesMonthly*electricityPerMile);
        totalEMonthlyCost = totalECost;

    }//ends our setETotalMonthlyCost
    //getter
    public Double getTotalEMonthlyCost(){
        return totalEMonthlyCost;
    }//ends get
    //overide java toString() method
    @Override
    public String toString(){
        return eCarName + " Total Monthly Costs: " + totalEMonthlyCost;

    }

}
