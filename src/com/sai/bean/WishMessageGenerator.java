package com.sai.bean;
import java.time.LocalDate;
import java.time.LocalTime;
public class WishMessageGenerator 
{
	private LocalTime lTime;
	private LocalDate lDate;

	public void setlTime(LocalTime lTime) 
	{
		System.out.println("WishMessageGenerator.setlTime()");
		this.lTime = lTime;
	}
	public void setlDate(LocalDate lDate) {
		this.lDate = lDate;
	}
	
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()");
		int hour = lTime.getHour();
		if(hour<12)
			return "Good Morning"+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<18)
			return "Good Evening "+user;
		else
			return"Good night"+user;
	}
	public String showWishMessageWithDate(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessageWithDate()");
		return user+" current  year is :"+lDate.getYear();
	}
	

	
	
}
