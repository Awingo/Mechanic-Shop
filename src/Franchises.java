
public class Franchises {
	
	private String franchiseLocation;
	private String franchiseName;
	private int franchiseNumber;
	private int facilitySize;
	
	public Franchises(String location, String name, int number, int facilityQuantity) {
		
		franchiseLocation = location;
		franchiseName = name;
		franchiseNumber = number;
		facilitySize = facilityQuantity;
		
	}
	public Franchises() {
		
	}
	public String getFranchiseLocation() {
		
		return this.franchiseLocation;
	}
	public void setFranchiseLocation(String location) {
		franchiseLocation = location;
	}
	public String getFranchiseName(String name) {
		return this.franchiseName;
	}
	
	public void setFranchiseName(String name) {
		franchiseName = name;
	}
	public int getFranchiseNumber(int number) {
		return this.franchiseNumber;
	}
	public void setFranchiseNumber(int number) {
		franchiseNumber = number;
	}
	public int getFacitlitySize(int facilityQuantity) {
		return this.facilitySize;
	}
	public void setFacilitySize(int facilityQuantity) {
		facilitySize = facilityQuantity;
	}
}
