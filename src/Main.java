import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Oil o = new Oil();
	static Tires a = new Tires();
	static Rotation b = new Rotation();
	static AirConditioning c = new AirConditioning();
	
	public static void main(String[] args) {	
		Employee E1 = new Employee("Bob", "Oil Changer");
		Employee E2 = new Employee("Jim", "Oil Changer");
		Employee E3 = new Employee("Mack", "Tire Changer");
		Employee E4 = new Employee("Steve", "Tire Changer");
		Employee E5 = new Employee("Bruce", "Mechanic");
		Employee E6 = new Employee("Frank", "Mechanic");
		Employee E7 = new Employee("Jane", "Assistant Manager"); // Because Equality
		Employee E8 = new Employee("Rob", "Manager");
		Employee[] ShiftOneEmployees = {E1,E2,E3,E4,E5,E6,E7,E8}; 
		Shift S1 = new Shift("Shift One", ShiftOneEmployees);
		Employee E9 = new Employee("Josh", "Oil Changer");
		Employee E10 = new Employee("Lee", "Oil Changer");
		Employee E11 = new Employee("Michael", "Tire Changer");
		Employee E12 = new Employee("Justin", "Tire Changer");
		Employee E13 = new Employee("Ed", "Mechanic");
		Employee E14 = new Employee("Mark", "Mechanic");
		Employee E15 = new Employee("John", "Assistant Manager");
		Employee E16 = new Employee("Murphy", "Manager");
		Employee[] ShiftTwoEmployees = {E9,E10,E11,E12,E13,E14,E15,E16};
		Shift S2 = new Shift("Shift Two", ShiftTwoEmployees);
		int choice = selectService();
		provideService(choice);


	}
	public static int selectService(){
		System.out.println("Hello, What brings you in today?");
		System.out.println("Please select from the list of choice from the services we offer."
				+ '\n'+ "1. Oil Change" + "\n" + "2. Tire Change" +"\n" + 
				"3. Tire Rotation" + "\n" + "4. Air Conditioning" + "\n" + "5. Maintainance" );
		int choice = scan.nextInt();
		return choice;
		
	}

	public static void provideService(int choice) {

		switch(choice) {
		//Providing cases from which the user can select from
		case 1: 
			System.out.println("You have chosen Oil Change");
			System.out.println("What is your engine size? 4 , 5 , 6 , 8");
			int engineSize = scan.nextInt();
			System.out.println("Here are the oil options" + "\n" + "1) Regular" + "\n" + "2) Full Synthetic");
			int oilChoice = scan.nextInt();
			int quarts = o.getQuarts(engineSize);
			o.getQuartPrice(oilChoice, quarts);
			break;
		case 2: 
			System.out.println("You have chosen Tire Change");
			System.out.println("What type of vehicle do you have?" + "\n" + "1) Car" + "\n" + "2) Truck"
					+ "\n" + "3) Van" + "\n" + "4) Motorcycle");
			int vehicleChoice = scan.nextInt();
			System.out.println("Here are the tire grade options: " + "\n" + "1) All-Season" + "\n" + 
					"2) Snow" + "\n" + "3) Performance" + "\n" + "4) OffRoad (truck only)");
			int tireChoice = scan.nextInt();
			a.mainChoice(vehicleChoice, tireChoice);
			a.carTires(tireChoice);
			break;
		case 3:
			System.out.println("You have chosen Tire Rotation");
			System.out.println("Here are the tire grade options: " + "\n" + "1) All-Season" + "\n" + 
					"2) Snow" + "\n" + "3) Performance" + "\n" + "4) OffRoad (truck only)");
			int rotationChoice = scan.nextInt();
			System.out.println("What type of vehicle do you have?" + "\n" + "1) Car" + "\n" + "2) Truck"
					+ "\n" + "3) Van" + "\n" + "4) Motorcycle");
			int vehicleChoice1 = scan.nextInt();
			
			b.rotate(rotationChoice, vehicleChoice1);
			b.rotateRate(vehicleChoice1);
			break;
		case 4: 
			System.out.println("You have chosen Air Conditioning" + " \n");
			System.out.println("Is you A/C working? 1) Yes/ 2) No");
			int airWorking = scan.nextInt();
			c.airDetermine(airWorking);
			break;
		case 5:
			System.out.println("You have chosen Maintainance" + "\n" + "Please select what issue you are having");
			break;
		case 6:
			break;
		}

	}

}
