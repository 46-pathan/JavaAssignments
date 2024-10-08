package stringassignments;

import java.time.LocalTime;
import java.util.Date;

//Write a Java program to display the system time. 

public class SystemTimeDisplay {

	public static void main(String[] args) {
		LocalTime currentTime=LocalTime.now();
		System.out.println("System Time : "+currentTime);
		
//		Date date=new Date();
//		System.out.println("System Date and Time : " +date.toString());

	}

}
