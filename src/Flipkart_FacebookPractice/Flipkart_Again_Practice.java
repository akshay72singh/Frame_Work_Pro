package Flipkart_FacebookPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart_Again_Practice  {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\sa\\SeleniumProgram\\drivers\\chromedriver.exe");
   
	ChromeOptions cromOption = new ChromeOptions();
	cromOption.addArguments("--remote-allow-origins=*");
	
	ChromeDriver  driver = new ChromeDriver(cromOption);
//    	com.get("http://localhost:8888/");
    	driver.get("http://facebook.com/");
//    com.get("http://instagram.com/");
//    com.get("https://www.sarkariresult.com/latestjob/");
//    By    hi= By.name("user_name");
//    WebElement d =com.findElement(hi);
//            d.sendKeys("admin");
//
//       By   j = By  .name("user_password") ;
//       WebElement  br= com.findElement(j);
//         br.sendKeys("ahttps://www.sarkariresult.com/latestjob/dmin");   
//    By   jj = By  .name("Latest jobs") ;
//    WebElement Web = com.findElement(jj);
//    Web.click();
    	driver.findElement(By.id("email")).sendKeys("7860720677");
    	driver.findElement(By.id("pass")).sendKeys("78@60@72");
    	
    			driver.findElement(By.name("login")).click();
    			Thread.sleep(3000);
    	driver.findElement(By.xpath("//span[text()='Confirm']")).click();
    	
    			driver.findElement(By.xpath("(//span[text()='Add Friend'])[8]")).click();
}
   
}
