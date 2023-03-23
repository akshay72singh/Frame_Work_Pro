package I_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	     driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/iframes/");
//	String automateNow = driver.findElement(By.xpath("//span[contains(text(),'automateNow')]")).getText();
//	System.out.println(automateNow);

//	String home = driver.findElement(By.xpath("//nav[@class=\"breadcrumbs\"]")).getText();
//	System.out.println(home);
	String iAmInFrame = driver.findElement(By.xpath("//p[text()='I am an iframe.']")).getText();
	System.out.println(iAmInFrame);
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers')]")).getText());
	driver.switchTo().defaultContent();
	String frame = driver.findElement(By.xpath("//h1[text()='IFrames']")).getText();
	System.out.println(frame);
	driver.switchTo().frame(1);
	System.out.println(driver.findElement(By.xpath("//h1[text()='Introducing Android 12.']")).getText());
	driver.switchTo().defaultContent();
	System.out.println(driver.findElement(By.xpath("//span[text()='Training']")).getText());
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	
	
	
	
	
	
	//System.out.println(driver.findElement(By.xpath("//span[text()='Training']")).getText());      //training
	}

}
