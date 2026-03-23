import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
		
		System.out.print("Enter a two-digit number: ");
		String number = sc.nextLine();
		
		char l1 = lottery.charAt(0);
		char l2 = lottery.charAt(1);
		
		if (number.length() == 2) {
			char n1 = number.charAt(0);
		    char n2 = number.charAt(1);
			if (l1 == n1 && l2 == n2) {
				System.out.println("You won 10000 dollars!");
			}
			else if (l1 == n2 && l2 == n1) {
				System.out.println("You won 3000 dollars!");
			}
			else if (l1 == n1 || l1 == n2 || l2 == n1 || l2 == n2) {
				System.out.println("You won 1000 dollars!");
			}
			else {
				System.out.println("Bad luck. See you next time!");
			}
				System.out.println("Lottery number is " + lottery);
		}
		else {
			System.out.println("Please enter a two digit number.");
		}
	}
}
