package FinancialClasses;

public class AssetExample {
    public static void main(String args[]) {
        Asset[] myPortfolio = {new Stock("MSFT", 118.92),
                new Cash(500),
                new DivendedStock("APPL", 196.51)};
        ((Stock) myPortfolio[0]).purchase(10, 120);
        ((Stock) myPortfolio[2]).purchase(10, 200);

        for (int i = 0; i < myPortfolio.length; i++) {
            System.out.println(myPortfolio[i]);
            System.out.println("Market Value is: " + myPortfolio[i]);
            System.out.println("My Profit is: " + myPortfolio[i]);

        }
    }
}
