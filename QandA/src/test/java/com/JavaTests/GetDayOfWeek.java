package com.JavaTests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayOfWeek {

	public static void main(String[] args) throws ParseException {
		String input_date="01/08/2012";
		  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		  Date dt1=format1.parse(input_date);
		Calendar c = Calendar.getInstance();
		Date d = new Date();
		
		c.setTime(dt1);
		System.out.print(c.get(Calendar.DAY_OF_WEEK));
	}

}
