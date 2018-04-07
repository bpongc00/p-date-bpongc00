package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(31, 12, 2018);
			System.out.println(today.toString());
			System.out.println(today.getMonthName());
			System.out.println(today.isDayRight(31));
			System.out.println(today.isDayRight(32));
			System.out.println(today.getSeasonName());
			System.out.println(today.getMonthsLeft());
			System.out.println(today.toString());
			System.out.println(today.getDaysLeftOfMonth());
			System.out.println(today.toString());
			System.out.println(today.daysPast());
			System.out.println(today.toString());
			System.out.println(today.getMonthsSameDays());
			System.out.println(today.toString());
			System.out.println(today.numRandomTriesEqualDate1());
			System.out.println(today.toString());
			System.out.println(today.numRandomTriesEqualDate2());
			System.out.println(today.toString());
			System.out.println(today.dayOfWeek(1));
			System.out.println(today.dayOfWeek(3));
			System.out.println(today.dayOfWeek(4));
			System.out.println(today.dayOfWeek(7));
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
