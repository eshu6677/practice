package javapractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class loginhm {
	
	
	static HashMap<String,String> logindata(){
		
		
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("ramesh", "ramesh@ramesh");
		hm.put("eshwar", "eshu@eshu");
		hm.put("ravi", "ravi@ravi");
		return hm;
	}
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
			WebDriver	driver=new InternetExplorerDriver();
			driver.manage().window().maximize();

		  driver.get("http://demo.guru99.com/test/newtours/");
		  
		  String credentials = logindata().get("ramesh");
		  
		   String arr[]=credentials.split("@");
		   
		   driver.findElement(By.name("userName")).sendKeys(arr[0]); // Passing
           
		   driver.findElement(By.name("password")).sendKeys(arr[1]); // Passing
		               
		   driver.findElement(By.name("submit")).click();
		   
		   driver.close();
		   
		  
		
	}
	

}
