package v_TigerProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtiger_SmallTaskByRoshan {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\driver\\chromedriver.exe");
		ChromeDriver auto = new ChromeDriver();
		auto.get("http://automationexercise.com/");
		
		String title = auto.getTitle();
		if(title.contains(title)) {
			System.out.println("home page is visible successfully");
		}else {
			System.out.println("home page is not visibal");
		}
	   auto.findElement(By.xpath("//a[text()= ' Signup / Login']")).click();	
		String signup = auto.getTitle();
	    if(signup.contains(signup)) {
	    	System.out.println("signup is clicked successifully");
	    }else {
	    	System.out.println("signup is not clicked successifully");
	    }
	   auto.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Akshay kumar");
	
	   auto.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("akshy134@gmail.com");
	
	auto.findElement(By.xpath("//button[text()='Signup']")).click();
	
	auto.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("19yadav20");
	
    auto.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();

	
	WebElement selectDays = auto.findElement(By.xpath("//select[@id=\"days\"]"));
	Select days = new Select (selectDays);
	days.selectByIndex(16);
	
	WebElement selectMonth = auto.findElement(By.xpath("//select[@id=\"months\"]"));
	Select month = new Select (selectMonth);
	month.selectByIndex(8);
	
	WebElement selectYear = auto.findElement(By.xpath("//select[@id=\"years\"]"));
	Select year = new Select (selectYear);
	year.selectByVisibleText("2003");
	
    auto.findElement(By.xpath("//input[@id=\"newsletter\"]")).click();
  
    auto.findElement(By.xpath("//input[@id=\"optin\"]")).click();

	auto.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("akshay");
	
	auto.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("yadav");
	
	auto.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("T C S");
	
	auto.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("Rayan Bhadohi");
	
	auto.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("Bhadohi");
	
	auto.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("Uttar Pradesh");
	
	auto.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Bhadohi");
	
	auto.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("221401");
	
	auto.findElement(By.xpath("//input[@id=\"mobile_number\"]")).sendKeys("7860720688");
	
	auto.findElement(By.xpath("//button[text()='Create Account']")).click();
	
	auto.findElement(By.xpath("//a[text()='Continue']")).click();
	
	
	
	
	
	
	}

}
