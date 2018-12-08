package enumexample;

public class WeekDay {
    Week day;
    String  weekDay;
	public WeekDay() {}
	public WeekDay(Week day) {
		this.day = day;
	}
	public WeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	
	public void whatIShouldDoToday() {
		switch(day) {
		case Monday:
			System.out.println("Review Sunday class materials");
			break;
		case Tuesday:
			System.out.println("Start doing the home work");
			break;
		case Wednesday:
			System.out.println("Continue with CodeLab");
			break;
		case Thursday:
			System.out.println("Continue with CodeLab");
			break;
		case Friday:
			System.out.println("Prepare for Weekend class materails");
			break;
		case Saturday:
			System.out.println("Join Saturday class");
			break;
		case Sunday:
			System.out.println("Join Sunday class");
			break;
	   default:
			System.out.println("No More days left of Week. Find another planet to get 8 days a week");
			break;	
		}

	}
		public void whatIShouldDoOnPlanetMars() {
			switch(weekDay) {
			case "Monday":
				System.out.println("Review Sunday class materials");
				break;
			case "Tuesday":
				System.out.println("Start doing the home work");
				break;
			case "Wednesday":
				System.out.println("Continue with CodeLab");
				break;
			case "Thursday":
				System.out.println("Continue with CodeLab");
				break;
			case "Friday":
				System.out.println("Prepare for Weekend class materails");
				break;
			case "Saturday":
				System.out.println("Join Saturday class");
				break;
			case "Sunday":
				System.out.println("Join Sunday class");
				break;
		   default:
				System.out.println("No More days left of Week. Find another planet to get 8 days a week");
				break;	
			}
	}
}
