package hw;

import java.util.InputMismatchException ;
import java.util.Scanner ;

public class HwC5Q3Exception {

	public static void main(String[] args) throws InputMismatchException {

		System.out.print("Enter date here (ex 1989 12 23) : ");

		int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int year ;
		int month ;
		int day ;
		int curday = 0 ;

		// check legal and leap year
		try (Scanner input = new Scanner(System.in)) {

			year = input.nextInt();
			month = input.nextInt();
			day = input.nextInt();
			
			if (year < 0  ) {
				throw new YearException() ;
			}else {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					monthdays[1] += 1 ;
				}
			}
			
			if (month < 0 || month > 12) {
				throw new MonthException() ;
			}
			
			if (day < 0 || day > monthdays[month - 1]) {
				throw new DayException() ;
			}
			
			// count
			for (int monthCount = 0; monthCount < month - 1; monthCount++) {
				curday += monthdays[monthCount];
			}
			curday += day;

			System.out.println(year + " 年 " + month + " 月 " + day + " 日, 為該年度的第 : " + curday + " 天 ");

		} catch (InputMismatchException ei) {
			System.out.println("請輸入數字") ;

		} catch (DateException e) {
			System.out.println(e.getErrorMesage()) ;
		}
	}
}