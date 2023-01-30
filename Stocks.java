public class Stocks extends  ShareAssets  {
   private int totalshares;

    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalshares=0;
    }


    @Override
    public double getMarketValue() {
        return totalshares*getCurrentPrice();
    }

    public int getTotalshares() {
        return totalshares;
    }

    //Records a purchase of the given number of Shares of the stock at the given
    //per share
    public void purchase(int share, double pricepersShare){
        totalshares+=share;
        addCost(share*pricepersShare);
    }
}
