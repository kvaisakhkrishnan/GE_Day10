import java.util.*;
public class NumberList {
	private ArrayList<Integer> numberList;
	NumberList(){
		numberList = new ArrayList<Integer>();
	}
	public void addNumber() {
		System.out.println("Enter number to be added: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		this.numberList.add(number);
		System.out.println("Added number "+number+" to the list");
	}
	public void findSecondLargestAndSmallest() {
		if(numberList.size() == 0) {
			System.out.println("Array has size 0");
		}
		else {
			int smallest = numberList.get(0);
			int largest = Integer.MIN_VALUE;
			for(int i = 0; i < numberList.size(); i++) {
				int currentElement = numberList.get(i);
				if(currentElement < smallest) {
					smallest = currentElement;
				}
				if(currentElement > largest) {
					largest = currentElement;
				}
			}
			int secondLargest = Integer.MIN_VALUE;
			for(int i = 0; i < numberList.size(); i++) {
				int currentElement = numberList.get(i);
				if(currentElement > secondLargest && currentElement < largest) {
					secondLargest = currentElement;
				}
			}
			System.out.println("Smallest Element in List is "+smallest);
			System.out.println("Second Largest Element in List is "+secondLargest);
		}
	}
}
