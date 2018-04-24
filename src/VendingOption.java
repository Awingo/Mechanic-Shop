import java.util.Scanner;

public class VendingOption {
	String vendChoice;
	public String vendGreeting(){
		System.out.println("Thank you for shopping");
		System.out.println("Choose your food");
		Scanner scan = new Scanner(System.in);
		vendChoice = scan.nextLine();
		System.out.println(vendChoice);
		return vendChoice;	
	}
	
}
