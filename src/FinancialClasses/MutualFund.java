//represents a mutual fund asset
package FinancialClasses;

public class MutualFund extends ShareAsset {
    private double totalShares;
    //constructs a new mutual fund investment with the
    //given symbol and PricePerShare
    public  MutualFund(String symbol, double currentPrice, double totalShares) {
        super(symbol, currentPrice);
        totalShares =0.0;

    }
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }
    public void purchase(double shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
