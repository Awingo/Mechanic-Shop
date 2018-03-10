import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Oil o = new Oil();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, What brings you in today?");
		System.out.println("Please select from the list of choice from the services we offer."
				+ '\n'+ "1. Oil Change" + "\n" + "2. Tire Change" +"\n" + 
				"3.Tire Rotation" + "\n" + "4.Maintainence" + "\n" + "5. Air Conditioning" );
		int choice = scan.nextInt();
		
		switch(choice) {
		//Providing cases from which the user can select from
		case 1: 
			System.out.println("Oil Change");
			break;
		case 2: 
			System.out.println("Tire Change");
			break;
		case 3:
			System.out.println("Tire Rotation");
			break;
		case 4: 
			System.out.println("Maintainence");
			break;
		case 5:
			System.out.println("Air Conditioning");
			break;
		case 6:
			System.out.println("If you are experiencing another issue. Our service members will be with you");

			// Prompting user what choice they would like to continue with
		}
		if (choice == 1) {
			System.out.println("You have chosen Oil Change");
			System.out.println("What is your engine size?");
			int option = scan.nextInt();
			o.getQuarts(option);
			
		}
		if (choice == 2) {
			System.out.println("You have chosen Tire Change" + "\n"+ "Please select what type of vehicle you have");
			
		}
		if (choice == 3) {
			System.out.println("You have chosen Tire Rotation" + " \n" + "Please select what type of vehilce yo have");
			
		}
		if (choice == 4) {
			System.out.println("You have chosen Maintainence" + "\n" + " Please select what your problem is");
			
		}
		if (choice == 5) {
			System.out.println("You have chosen Air Conditioning" + "\n" + "Please select what issue you are having");
			
		}
	}

	

}
