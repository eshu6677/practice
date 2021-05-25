package javapractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class liginhashmapdata {
	
	public static HashMap<String ,String> logindata(){
		
		HashMap<String ,String> credentials=new HashMap<String, String>();
		
		credentials.put("ramesh", "rameshadepu@ramesh");
		credentials.put("sandeep", "sandeep@sandeepj");
		
		return credentials;
		
		
	}

	public static void main(String[] args) throws Exception {
		

		 System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
			WebDriver	driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
			
			String data = logindata().get("ramesh");
			
			String arr[]=data.split("@");
			
			driver.findElement(By.name("username")).sendKeys(arr[0]);
			driver.findElement(By.name("password")).sendKeys(arr[1]);
			
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
			driver.close();
			
			
			
			
			
		
		

	}

}
