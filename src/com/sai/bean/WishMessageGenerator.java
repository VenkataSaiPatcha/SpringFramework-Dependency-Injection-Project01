package com.sai.bean;
import java.time.LocalTime;
public class WishMessageGenerator 
{
	public LocalTime lTime;

	public void setlTime(LocalTime lTime) 
	{
		System.out.println("WishMessageGenerator.setlTime()");
		this.lTime = lTime;
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

	
	
}
