// A general asset that has a symbol and hold shares.
package FinancialClasses;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost, currentPrice;

    //constructs a new share asset with the givern symbol
    //and current price
    public ShareAsset(String symbol, double currentPrice) {
         this.symbol = symbol;
         this.currentPrice =currentPrice;
         totalCost =0.0;
    }
    //return the current market value of this asset.
    //the children of ShareAsset MUST implement the
    // get MarketValue() method, unless the child
    // itself is an abstract class.
    public abstract double getMarketValue();

    //returns the profit earned on shares of this asset
    public double getProfit() {
        return getMarketValue() - totalCost;
    }

    //Getter: return the price per share of this asset
    public double getCurrentPrice() {
        return currentPrice;
    }

    //Getter: returns this asset's total cost spent on all shares

    public double getTotalCost() {
        return totalCost;
    }

    //Getter: return the symbol of a specific ShareAsset
    public String symbol() {
        return symbol;
    }

    //Setter: sets the current price of this asset
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    //Setter: adds a cost of the given amount to this asset
    public void addCost(double cost) {
        totalCost+=cost;
    }
}


