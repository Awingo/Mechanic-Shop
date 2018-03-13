
public class Oil {

Double quartPrice = 0.00;
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
	public Double getQuartPrice(int oilChoice, int quarts) {
		Double quartPrice = 0.00;
		Double regularOil = 8.99;
		Double syntheticOil = 10.49;
		Double labor = 15.00;
		Double fullPrice = 0.00;
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
