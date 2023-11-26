import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number till which the Fibonacci series to print: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci series up to " + number +" numbers : ");
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }
   
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2);
    }
}