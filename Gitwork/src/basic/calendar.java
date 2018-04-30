package basic;

class calendar {

	private static void print(int year,int month){
		int one=getWeekend(year,month,1);
		System.out.println(year+"年"+month+"月");
		System.out.printf("日\t一\t二\t三\t四\t五\t六\n");
		for(int i=0;i<one;i++) {
			System.out.print("\t");
		}
		int lastday=getDays(year,month);
		for(int i=1;i<=lastday;i++) {
			System.out.print(i+"\t");
			if(getWeekend(year, month, i)==6)
				System.out.println();
		}	
	}

	private static int getDays(int year, int month) {
		// TODO Auto-generated method stub
		switch (month) {
		case 2:
			return isleapyear(year)?29:28;
		case 4:case 6:case 9:case 11:
			return 30;

		default :
			return 31;
		}
	}

	private static int getWeekend(int year, int month, int day) {
		// TODO Auto-generated method stub
		int days=0;
		for(int i=1;i<year;i++)
			days+=getDays(i);
		for(int i=1;i<month;i++)
			days+=getDays(year,i);
		days+=day-1;
		return (days+1)%7;
	}

	private static int getDays(int year) {
		// TODO Auto-generated method stub
		
		return isleapyear(year)?366:365;
	}

	private static boolean isleapyear(int year) {
		// TODO Auto-generated method stub
		return year%4==0&&year%100!=0||year%400==0;
	}

	public static void main(String[] args) {
		System.out.println(getWeekend(2018, 3, 1));
		print(2018,3);
	}

}