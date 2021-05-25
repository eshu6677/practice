package javapractice;


import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class dataDrivenFromHashMap {



 // method return HashMap object with data pairs
 static HashMap<String ,String > logindata() {
  HashMap<String ,String > hm = new HashMap<String,String>();
  hm.put("x", "mercury@mercury");
  hm.put("y", "mercury1@mercury1");
  hm.put("z", "mercury2@mercury2");

  return hm;
 }

 public static void main(String[] args) throws Exception {

	 System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
	WebDriver	driver=new InternetExplorerDriver();
	driver.manage().window().maximize();

  driver.get("http://demo.guru99.com/test/newtours/");

  // Login as X
   String credentials = logindata().get("x"); // Retriving value 'x' from
            
  String uarr[] = credentials.split("@"); // separting value of 'x' int o
            // 2 parts using delimeter '@'

  driver.findElement(By.name("userName")).sendKeys(uarr[0]); // Passing
                 
  driver.findElement(By.name("password")).sendKeys(uarr[1]); // Passing
              
  driver.findElement(By.name("submit")).click();
  // Validation
  if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
   System.out.println("Test Passed");

  } else {
   System.out.println("Test failed");

  }

 }



}
