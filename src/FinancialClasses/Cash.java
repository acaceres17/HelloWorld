//represents the amount of money held by investors
package FinancialClasses;

public class Cash implements Asset {
    private double amount;

    //constructs a cash investment of the given amount
    public Cash(double amount ) {
        this.amount = amount;
    }
    //returns this cash's investments market  value
    //which is equal to the amount of cash
    public double getMarketValue() {
        return amount;
    }
    public double getProfit() {
        return 0;
    }
    public void setAmount(double amount) {
        this.amount += amount;
    }

}
