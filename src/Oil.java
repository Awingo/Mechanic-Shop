
public class Oil {


	public int getQuarts(int option){
		int quarts = 0;
		switch(option) {
		case 4:
			
			System.out.println("You have selected four cylinders");
			System.out.println("We are currently out of non Synthetic, I apologize for the inconvenience");
			quarts = 4;


		case 5:

			System.out.println("You have selected five cylinders");
			System.out.println("We are currently out of non Synthetic, I apologize for the inconvenience");
			quarts = 5;


		case 6:

			System.out.println("You have selected six cylinders");
			System.out.println("We are currently out of non Synthetic, I apologize for the inconvenience");
			quarts = 6;


		case 8:
			System.out.println("You have selected eight cylinders");
			System.out.println("We are currently out of non Synthetic, I apologize for the inconvenience");
			quarts = 8;

		}
		return quarts;
	}

}
