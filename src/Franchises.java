
public class Franchises {
	
	private String FranchiseLocation;
	
	public Franchises(String name) {
		
		FranchiseLocation = name;
	}
	public Franchises() {
		
	}
	public String getFranchiseLocation() {
		
		return this.FranchiseLocation;
	}
	public void setFranchiseLocation(String name) {
		FranchiseLocation = name;
	}
	
}
