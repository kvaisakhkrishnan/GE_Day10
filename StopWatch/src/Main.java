import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Press Enter to start");
        input.nextLine();
        long start_time = System.nanoTime();

        System.out.println("Press Enter to stop");
        input.nextLine();
        long end_time = System.nanoTime();

        // Calculate elapsed time
        long elapsed_time = TimeUnit.SECONDS.convert((end_time - start_time), TimeUnit.NANOSECONDS);

        // Print elapsed time
        System.out.println("Elapsed time: " + elapsed_time + " seconds");
    }
}