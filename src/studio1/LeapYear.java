package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Add a year and we will tell u if its a leap year or not");
		System.out.println("Type the year");
		int year = in.nextInt();
boolean Ifleapyear = (year % 4 ==0)&& (!(year % 100 ==0)|| (year % 400==0));
		System.out.println(year + " is a leap year, this is " + Ifleapyear);
	}

}
