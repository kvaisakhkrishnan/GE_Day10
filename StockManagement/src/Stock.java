import java.util.*;
import java.io.*;

class Stock {
    String name;
    int numShares;
    double sharePrice;

    public Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public double value() {
        return numShares * sharePrice;
    }
}