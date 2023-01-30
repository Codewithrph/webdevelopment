public class Cash implements Asset{

    private double amount; // Amount of money held

    public Cash(double amount){
        this.amount=amount;
    }

    @Override
    public double getMarketValue() {
        return amount;
    }
    //sinece cash is fixed price so no profit will return
    @Override
    public double getProfit() {
        return 0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
