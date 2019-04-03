//represents a stock purchase that also pays dividends
package FinancialClasses;

public class DivendedStock extends Stock{
    private double dividend; // amount of dividends paid

    //constructs a new dividend stock with the given symbol
    //and no shares purchased
    public DivendedStock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        dividend =0.0;
    }
    //returns the DividendStocks market value, which is normal Stock's
    //market value plus any dividends
    public double getMarketValue() {
        return super.getMarketValue() + dividend;
    }
    //records a dividend of the given amount per share
    public void getDividend(double amountPerShare) {
        dividend += amountPerShare * getTotalShares();
    }

}
