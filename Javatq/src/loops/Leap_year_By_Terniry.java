package loops;

public class Leap_year_By_Terniry {

	public static void main(String[] args) {
		int y=1700;
		String result;
		  result=(y%4==0 && y%100!=0)?"leap year":y%100==0 && y%400==0?"leap year":"not a leap year";
        System.out.println(result);
	}

}
