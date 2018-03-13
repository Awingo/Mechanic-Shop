
public class AirConditioning {
	int airFunction = 0;
	public int airDetermine(int airWorking) {
		airFunction = 1;
		if (airWorking == 1) {
			System.out.println("You do not need this service");
		}
		if (airWorking == 2) {
			airFunction = 2;
			System.out.println("We will run a diagnosis");
		}
		return airFunction;	
	}
	
}
