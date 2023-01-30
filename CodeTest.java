public class CodeTest {
    public static void main(String[] args) {
        // Financial Software
        //1-Classes: Stocks, DividendStocks, MutualFunds, Cash
        //2- Relations: Dividend-stock Is-a Stock(Inheritance)

        //3- Because different assets compute their market values in different ways:
//        we will use Interface: getmarket value and getProfit
        //4-Similarities between mutual funds and stocks?
//        they both store assets that are based on shares

        Asset asset=new MutualFunds("How is going",300);
        System.out.println(asset.getMarketValue());




    }
}