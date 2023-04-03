public class Diesel {

    private String dieselCarName;
    private double dFinancePayment;
    private double DMPG;
    private Double totalDMonthlyCost;

    //constructor
    public Diesel(String dName, Double dPayment, Double dMileage) {

        dieselCarName = dName;
        dFinancePayment = dPayment;
        DMPG = dMileage;

    }//ends our constructor

    //set car name
    public void setName(String dName){ dieselCarName = dName; }//ends setter for name
    //get car name
    public String getName(){
        return dieselCarName;
    }//ends our get name

    public void setdFinancePayment(Double dPayment){
        dFinancePayment = dPayment;
    }
    //getter for finance
    public Double getdFinancePayment(){
        return dFinancePayment;
    }//ends get finance

    public void setDMPG(Double dMileage){
        DMPG = dMileage;
    }
    //getter for Milage
    public Double getDMPG(){
        return DMPG;
    }
    //need to do calculations for our monthly cost
    //setTotalMonthlyCost
    public void setTotalDMonthlyCost(Double milesMonthly, Double dieselCost){
        Double totalDCost = this.dFinancePayment + (milesMonthly/this.DMPG * dieselCost);
        totalDMonthlyCost = totalDCost;

    }//ends our setTotalMonthlyCost

    public Double getTotalDMonthlyCost(){
        return totalDMonthlyCost;
    }//ends get
    //overide java toString() method
    @Override
    public String toString(){
        return dieselCarName + " Total Monthly Costs: " + totalDMonthlyCost;

    }

}