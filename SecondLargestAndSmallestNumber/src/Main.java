import java.util.*;
public class Main {
	public static void main(String args[]) {
		NumberList numberList = new NumberList();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Select an option:\n1. Add an element\n2. Find Smallest and Second Largest Elemenet\n3. Exit");
			int option = scanner.nextInt();
			if(option == 1) {
				numberList.addNumber();
			}
			else if(option == 2) {
				numberList.findSecondLargestAndSmallest();
			}
			else {
				break;
			}
		}
	}
}
