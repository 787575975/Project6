package enumexample;

public class TestWeek {

	public static void main(String[] args) {
		WeekDay day = new WeekDay(Week.Wednesday);
		day.whatIShouldDoToday();
		
		WeekDay day2 = new WeekDay("Friday");
		day2.whatIShouldDoOnPlanetMars();

	}

}
