public class Gas {
    //setup instance variables - what pieces of data does every gas car need


    private String carName;
    private double financePayment;
    private double MPG;

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

    //public void (Double setFinancePayment){

    }
