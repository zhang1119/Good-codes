package basic;

class calendar {

	private static void print(int year, int month) {
		// TODO Auto-generated method stub
		System.out.println("\n" + year + "年" + month + "月");
		System.out.printf("日\t一\t二\t三\t四\t五\t六\n");
		int one = getWeekend(year, month, 1);
		for (int i = 0; i < one; i++) {
			System.out.printf("\t");
		}
		int lastday = getDays(year, month);
		for (int i = 1; i < lastday; i++) {
			System.out.printf("%2d\t", i);
			if (getWeekend(year, month, i) == 6)
				System.out.println();
		}

	}

	private static void print(int year) {

		// TODO Auto-generated method stub
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
	}

	private static int getDays(int year, int month) {
		// TODO Auto-generated method stub
		switch (month) {
		case 2:
			return isLeapyear(year) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	private static boolean isLeapyear(int year) {
		// TODO Auto-generated method stub
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private static int getWeekend(int year, int month, int day) {
		// TODO Auto-generated method stub
		int s = 0;
		for (int i = 1; i < year; i++) {
			s += getDays(i);
		}
		for (int i = 1; i < month; i++) {
			s += getDays(year, i);
		}
		s += day - 1;
		return (s + 1) % 7;
	}

	private static int getDays(int year) {

		// TODO Auto-generated method stub
		return isLeapyear(year) ? 366 : 365;
	}

	public static void main(String[] args) {
		print(2018);
	}

}