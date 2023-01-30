public abstract class ShareAssets implements Asset {
    // this is a redunant coding
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAssets(String symbol,double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost=0.0;
    }
    // ads a cost of the given amount to this asset
    public void addCost(double cost){

        totalCost +=cost;
    }
    //return the price per share of this asset
    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public void setCurrentPrice(double currentPrice){

        this.currentPrice=currentPrice;
    }
    //this return the cureent market value of this asset
    public abstract double getMarketValue();
    //return the profit earned on shares of this asset
    public double getProfit(){
        // calls  abstract getMarketvalue Method
        return getMarketValue()-totalCost;
    }

}
