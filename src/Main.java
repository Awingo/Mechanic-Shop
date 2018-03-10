import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Oil o = new Oil();
	public static void main(String[] args) {	
		int choice = selectService();
		provideService(choice);

	}
	public static int selectService(){
		System.out.println("Hello, What brings you in today?");
		System.out.println("Please select from the list of choice from the services we offer."
				+ '\n'+ "1. Oil Change" + "\n" + "2. Tire Change" +"\n" + 
				"3.Tire Rotation" + "\n" + "4.Maintainence" + "\n" + "5. Air Conditioning" );
		int choice = scan.nextInt();
		return choice;
		
	}

	public static void provideService(int choice) {

		switch(choice) {
		//Providing cases from which the user can select from
		case 1: 
			System.out.println("You have chosen Oil Change");
			System.out.println("What is your engine size?");
			int engineSize = scan.nextInt();
			System.out.println("Here are the oil options" + "\n" + "1) Regular" + "\n" + "2) Full Synthetic");
			int oilChoice = scan.nextInt();
			int quarts = o.getQuarts(engineSize);
			o.getQuartPrice(oilChoice, quarts);
			break;
		case 2: 
			System.out.println("You have chosen Tire Change" + "\n"+ "Please select what type of vehicle you have");
			
		case 3:
			System.out.println("You have chosen Tire Rotation" + " \n" + "Please select what type of vehilce yo have");

		case 4: 
			System.out.println("You have chosen Tire Rotation" + " \n" + "Please select what type of vehilce yo have");

		case 5:
			System.out.println("You have chosen Air Conditioning" + "\n" + "Please select what issue you are having");

		case 6:


			// Prompting user what choice they would like to continue with
		}

	}

}
