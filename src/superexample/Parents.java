package superexample;

public abstract class Parents {

	String familyName = "Bush";
	
	public Parents() {
		System.out.println("This is parents class constructor");
	}
	public Parents(String familyName) {
		this.familyName = familyName;
		System.out.println("This is parents class constructor "+ familyName);
	}
	
	public void height() {
		System.out.println("Average height");
	}
	public void color() {
		System.out.println("brown");
	}
}
