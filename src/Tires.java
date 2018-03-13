
public class Tires {
	int tireType = 0;
	Double totalCost = 0.0;
	Double labor = (15.00 * 4);
	Double totalFull = 0.00;
	public int mainChoice(int vehicleChoice, int tireChoice) {
		switch(vehicleChoice) {
		case 1:
			System.out.println("You are currently shopping for car tires\n");
			tireType = 1;
			if(tireType == 1) {
				carTires(tireChoice);
			}
			if(tireChoice == 1) {
				System.out.println("You have selected all-season tires.");
			}
			if(tireChoice ==2) {
				System.out.println("You have selected snow tire");
			}
			if(tireChoice ==3) {
				System.out.println("You have selected Performance tires");
			}
			System.out.println("The cost of you tires are: $" + totalCost + ", with labor, the total is: $" 
			+ totalFull);
			if(tireChoice ==4) {
				System.out.println("Sorry, we can only mount OffRoad tires for truck at this times.");
			}
			break;
		case 2:
			System.out.println("You are currently shopping for truck tires\n\n");
			tireType = 2;
			if(tireType == 2) {
				truckTires(tireChoice);
			}
			if(tireChoice == 1) {
				System.out.println("You have selected all-season tires.");
			}
			if(tireChoice ==2) {
				System.out.println("You have selected snow tire");
			}
			if(tireChoice ==3) {
				System.out.println("You have selected Performance tires");
			}
			if(tireChoice ==4) {
			System.out.println("You have selected OffRoad tires");
			}
			System.out.println("The cost of you tires are: $" + totalCost + ", with labor, the total cost is: $"
			+ totalFull);
			break;
		case 3:
			System.out.println("You are currently shopping for van tires\n\n");
			tireType = 3;
			if(tireType == 3) {
				vanTires(tireChoice);
			}
			if(tireChoice == 1) {
				System.out.println("You have selected all-season tires.");
			}
			if(tireChoice ==2) {
				System.out.println("You have selected snow tire");
			}
			if(tireChoice ==3) {
				System.out.println("You have selected Performance tires");
			}
			System.out.println("The cost of you tires are: $" + totalCost + ", with labor, your total is: $" 
					+ totalFull);
			if(tireChoice ==4) {
				System.out.println("Sorry, we can only mount Off Road tires for truck at this times.");
			}
			break;
		case 4:
			System.out.println("You are currently shopping for motorcycle tires\n\n");
			tireType = 4;
			if(tireType == 4) {
				motorcycleTires(tireChoice);
			}
			if(tireChoice == 1) {
				System.out.println("You have selected all-season tires.");
			}
			if(tireChoice ==2) {
				System.out.println("You have selected snow tire");
			}
			if(tireChoice ==3) {
				System.out.println("You have selected Performance tires");
			}
			System.out.println("The cost of you tires are: $" + totalCost + ", with labor, your total cost is:"
					+ " $" + totalFull);
			if(tireChoice ==4) {
				System.out.println("Sorry, we can only mount Off Road tires for truck at this times.");
			}
			break;
		}
		
		return tireType;	
	}
	
	public Double carTires(int tireChoice){
		Double allSeason = 100.00;
		Double snow = 120.00;
		Double performance = 300.00;
		Double taxTotal = 0.00;
		Double tax = 0.15;
		if(tireChoice == 1) {
			totalCost = (allSeason * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice == 2) {
			totalCost = (snow * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice ==3) {
			totalCost = (performance * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		return totalCost;
		
	}
	public Double truckTires(int tireChoice){
		Double allSeason = 250.00;
		Double snow = 340.00;
		Double performance = 400.00;
		Double offRoad = 200.00;
		Double taxTotal = 0.00;
		Double tax = 0.15;
		
		if(tireChoice == 1) {
			totalCost = (allSeason * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice == 2) {
			totalCost = (snow * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice ==3) {
			totalCost = (performance * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice == 4) {
			totalCost = (offRoad * 4);
			taxTotal = (totalCost* tax);
			totalCost = (totalCost * taxTotal);
			totalFull = (totalCost + labor);
		}
		return totalCost;
		
	}
	public Double vanTires(int tireChoice){
		Double allSeason = 80.00;
		Double snow = 120.00;
		Double performance = 110.00;
		Double taxTotal = 0.00;
		Double tax = 0.15;
		if(tireChoice == 1) {
			totalCost = (allSeason * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice == 2) {
			totalCost = (snow * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		if(tireChoice ==3) {
			totalCost = (performance * 4);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
			totalFull = (totalCost + labor);
		}
		return totalCost;
		
	}
	public Double motorcycleTires(int tireChoice){
		Double allSeason = 200.99;
		Double snow = 329.00;
		Double performance = 670.00;
		Double taxTotal = 0.00;
		Double tax = 0.15;
		if(tireChoice == 1) {
			totalCost = (allSeason * 2);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
		}
		if(tireChoice == 2) {
			totalCost = (snow * 2);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
		}
		if(tireChoice ==3) {
			totalCost = (performance * 2);
			taxTotal = (totalCost * tax);
			totalCost = (totalCost + taxTotal);
		}
		return totalCost;
		
	}
}
