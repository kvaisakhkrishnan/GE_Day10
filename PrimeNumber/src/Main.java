import java.util.*;
public class Main {
	
	static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			System.out.println("Zero and One are not considered as Prime");
			return false;
		}
		for(int i = 2; i<=num/2; i++) {
			if((num % i) == 0) {
				return true;
			}
			return false;
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check for prime: ");
		int number = scanner.nextInt();
		boolean checkPrime = isPrime(number);
		if(checkPrime == false) {
			System.out.println(number + " is a prime number");
		}
		else {
			System.out.println(number + " is not a prime number");
		}
		
	}
}
