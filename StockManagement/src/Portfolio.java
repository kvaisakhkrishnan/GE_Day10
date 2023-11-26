import java.util.*;
class Portfolio {
    ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        this.stocks.add(stock);
    }

    public double totalValue() {
        double sum = 0;
        for (Stock stock : this.stocks)
            sum += stock.value();
        return sum;
    }

    public void report() {
        for (Stock stock : this.stocks) {
            System.out.println("Stock Name: " + stock.name + 
            "\nNumber of Shares: " + stock.numShares + 
            "\nShare Price: " + stock.sharePrice + 
            "\nStock Value: " + stock.value());
            System.out.println();
        }
        System.out.println("Total Value of Stocks: " + totalValue());
    }
}