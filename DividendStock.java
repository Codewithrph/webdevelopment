public class DividendStock extends Stocks{

    private double dividends; //amount of dividends paid
    public DividendStock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        dividends=0;
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue()+dividends;
    }

    //record a dividend of the given amount per share
    public void payDividend(double amountPerShare){
         dividends +=amountPerShare*getTotalshares();
    }
}
