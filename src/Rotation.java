
public class Rotation {
	int rotateType = 0;
	Double allSeasonRate = (10.00 * 4);
	Double snowRate = (15.00 * 4);
	Double performanceRate = (20.00 * 4);
	Double offRoadRate = (18.00 * 4);
	Double totalCost = 0.00;
	Double totalFull = 0.00;
	
	public int rotate(int rotationChoice, int vehicleChoice1){
		switch(rotationChoice) {
		case 1:
			rotateType = 1;
				System.out.println("You are rotating all-season tires");
				rotateRate(rotationChoice);
				System.out.println("The price of rotating your tires is: $" + totalCost);
				break;
		case 2:
			rotateType = 2;
				System.out.println("You are rotating snow tires");
				rotateRate(rotationChoice);
				System.out.println("The price of rotating your tires is: $" + totalCost);
				break;
		case 3:
			rotateType = 3;
				System.out.println("You are rotating performance tires");
				rotateRate(rotationChoice);
				System.out.println("The price of rotating your tires is: $" + totalCost);
				break;
		case 4: 
			rotateType = 4;
			if(rotateType == 4 && vehicleChoice1 == 2) {
				System.out.println("You are rotating offroad tires");
				rotateRate(rotationChoice);
				System.out.println("The price of rotating your tires is: $" + totalCost);
			}
			break;
		}
		return rotateType;
	}
	
	
	public Double rotateRate(int vehicleChoice1) {
		Double tax = 0.15;
		Double taxFull = 0.00;
		if (rotateType == 1) {
			taxFull = (allSeasonRate * tax);
			totalCost = (allSeasonRate + taxFull);
			return totalCost;
		}
		if (rotateType == 2) {
			taxFull = (snowRate * tax);
			totalCost = (snowRate + taxFull);
			return totalCost;
		}
		if (rotateType == 3) {
			taxFull = (performanceRate * tax);
			totalCost = (performanceRate + taxFull);
			return totalCost;
		}
		if (rotateType == 4 && vehicleChoice1 == 2) {
			taxFull = (offRoadRate * tax);
			totalCost = (offRoadRate + taxFull);
			return totalCost;
		}
		return totalFull;
	}

}
	