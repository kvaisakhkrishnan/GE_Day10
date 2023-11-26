import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int number = scanner.nextInt();
        
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }
}