package javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class task {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
		WebDriver	driver=new InternetExplorerDriver();
		driver.manage().window().maximize();

	  driver.get("https://www.seleniumeasy.com/test/");
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
	  
	  
	  
	}

}
