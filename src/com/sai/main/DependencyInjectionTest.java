package com.sai.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.sai.bean.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		// IOC container created
		FileSystemXmlApplicationContext ctx = 
	new FileSystemXmlApplicationContext("D:/Spring&SpringBootPrograms/IOCProj01_DependencyInjection/src/com/sai/confg/applicationContext.xml");
			
		// get the target spring bean class object ref
		Object obj=ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		// invoke the business method
		String message=generator.showWishMessage("sai");
		System.out.println("result :"+message);
		// close the IOC Container
		ctx.close();
	}

}
