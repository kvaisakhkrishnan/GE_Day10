import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of distinct coupons: ");
        int n = scanner.nextInt();
        int count = couponCollector(n);
        System.out.println("Total random numbers needed to have all distinct numbers is: " + count);
    }

    public static int getRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }

    public static int couponCollector(int n) {
        HashSet<Integer> collected = new HashSet<Integer>();
        int count = 0;

        while (collected.size() < n) {
            int coupon = getRandomNumber(n);
            collected.add(coupon);
            count++;
        }
        return count;
    }
}