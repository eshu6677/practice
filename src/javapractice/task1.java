package javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class task1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","‪‪C:\\Users\\DELL\\eclipse-Newworkspace\\javapractice\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();

	  driver.get("https://www.seleniumeasy.com/test/");
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
	  
	  
	  
	
	}

}
