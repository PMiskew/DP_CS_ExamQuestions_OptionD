package OptionDMay2016;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dates {

	private int day;
	private int month;
	private int year; 
	
	public Dates(int day, int month, int year) {
		
		this.day = day;
		this.month = month; 
		this.year = year;
		
	}
	
	public int getDay() { return day; }
	public int getMonth() { return month; }
	public int getYear() {return year; }
	
	public static int StayDays(Dates x, Dates y) { 
		
		Date d1 = new Date(x.year,x.month,x.day);
		Date d2 = new Date(y.year,y.month,y.day);
		
		 long diff = d2.getTime() - d1.getTime();
		 return (int)(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

		
		
		
	}
	public static void main(String[] args)  {
		
		Dates x = new Dates(1,1,2019);
		Dates y = new Dates(21,1,2019);
		int days = Dates.StayDays(x, y);
		System.out.println(days);

	}
	
}
