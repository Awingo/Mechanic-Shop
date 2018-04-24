
public class Oil {

	double quartPrice = 0.00;
	public int getQuarts(int engineSize){
		int quarts = 0;
		switch(engineSize) {
		case 4:
			System.out.println("You have selected four cylinders");
			quarts = 4;
			
			break;
		case 5:
			System.out.println("You have selected five cylinders");
			quarts = 5;
			break;
		case 6:
			System.out.println("You have selected six cylinders");
			quarts = 6;
			break;
		case 8:
			System.out.println("You have selected eight cylinders");
			quarts = 8;
			break;
		}
		return quarts;
	}
	public double getQuartPrice(int oilChoice, int quarts) {
		double quartPrice = 0.00;
		double regularOil = 8.99;
		double syntheticOil = 10.49;
		double labor = 15.00;
		double fullPrice = 0.00;
		if (oilChoice == 1) {
			quartPrice = (regularOil * quarts);
			fullPrice = (quartPrice + labor);
		}
		if(oilChoice == 2) {
			quartPrice = (syntheticOil * quarts);
			fullPrice = ( quartPrice + labor);
		}
		System.out.println("Your oil price is: " + quartPrice + " After labor, your total is: " + fullPrice);
		return quartPrice;
		
	}
}
