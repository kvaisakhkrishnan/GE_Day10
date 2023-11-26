import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Portfolio portfolio = new Portfolio();
        Scanner scanner = new Scanner(new File("/Users/vaisakhkrishnank/eclipse-workspace/StockManagement/src/StockInput.txt"));

        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            Stock stock = new Stock(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]));
            portfolio.addStock(stock);
        }

        portfolio.report();
    }
}