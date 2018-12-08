package superexample;

public class Children extends Parents{
	
	public Children() {
		//super();
		super("BUSH");
	}
	
	public void shapeNheight() {
		System.out.println(super.familyName);
		super.height();
		super.color();
		System.out.println("AVerage shape");
	}

}
