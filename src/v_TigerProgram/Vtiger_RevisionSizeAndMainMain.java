package v_TigerProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Vtiger_RevisionSizeAndMainMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Java_Basic\\rrr\\driver\\chromedriver.exe");
		ChromeDriver launch = new ChromeDriver();
		launch.get("http://localhost:8888");

		String TextOfbigArrow = launch.findElement(By.xpath("//img[@title='Sign in']")).getText();
		System.out.println(TextOfbigArrow + "this is your ANS of big Arrow");

		if (TextOfbigArrow.contains("")) {
			System.out.println("arrow text is pass");
		} else {
			System.out.println("arrow text is fail");
		}
		Point LocationOfbigArrow = launch.findElement(By.xpath("//img[@title='Sign in']")).getLocation();
		int x = LocationOfbigArrow.getX();
		int y = LocationOfbigArrow.getY();
		System.out.println("X = " + x + ",Y = " + y);

		int x1 = LocationOfbigArrow.x;
		int y1 = LocationOfbigArrow.y;
		System.out.println("X = " + x1 + ",Y = " + y1);

		Dimension SizeOfBigArrow = launch.findElement(By.xpath("//img[@title='Sign in']")).getSize();
		int hght = SizeOfBigArrow.getHeight();
		int wdth = SizeOfBigArrow.getWidth();
		System.out.println("hight = " + hght + ",width = " + wdth);

		int hght1 = SizeOfBigArrow.height;
		int wdth1 = SizeOfBigArrow.width;
		System.out.println("hight = " + hght1 + ",width = " + wdth1);
//  
//    String OptionOn_UI = launch.findElement(By.xpath("//img[@src='themes/images/bullets.gif']")).getText();
//    System.out.println("text Of Option On_UI");
//    //System.out.println(OptionOn_UI.isBlank());
//    if (OptionOn_UI.isBlank()) {
//    	System.out.println("text Of Option On_UI is pass");
//    } else {
//    	System.out.println("text Of Option On_UI is fail");
//    }
//    Dimension usrNameBoxSize = launch.findElement(By.xpath("//input[@class='small']")).getSize();
//    int ht = usrNameBoxSize.getHeight();
//    int wd = usrNameBoxSize.getWidth();
//    System.out.println("hight = "+ht+",width = "+wd);
//    
//    boolean usernameboox = launch.findElement(By.xpath("//input[@class='small']")).isEnabled();
//    System.out.println(usernameboox);
//    
//    boolean usernamebooxDisplayed = launch.findElement(By.xpath("//input[@class='small']")).isDisplayed();
//    System.out.println(usernamebooxDisplayed);
//    
//    Point LocationOfNameBox = launch.findElement(By.xpath("//input[@class='small']")).getLocation();
//    LocationOfNameBox.getX();
//    LocationOfNameBox.getY();
//    System.out.println("X = "+LocationOfNameBox+", Y = "+LocationOfNameBox);
//    
//    launch.findElement(By.xpath("//input[@class='small']")).sendKeys("admin");
//   
//    
//    WebElement colourOfTheam = launch.findElement(By.xpath("//select[@name='login_theme']"));
//    Select colourTheam = new Select(colourOfTheam);
//    colourTheam.selectByIndex(2);
////    colourTheam.selectByValue("bluelagoon");
////    colourTheam.selectByVisibleText("woodspice");               
//     
//    launch.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//
//    Dimension sizeOfsignButton = launch.findElement(By.xpath("//input[@value='  Login  ']")).getSize();
//    int hight = sizeOfsignButton.getHeight();
//    int widh = sizeOfsignButton.getWidth();	
//    System.out.println("hight = "+hight+",width = "+widh);
//    launch.findElement(By.xpath("//input[@value='  Login  ']")).click();
//    
//  launch.findElement(By.xpath("//a[text()='Marketing']")).click();
//  List<WebElement> uponTheChartOfCompainsList = launch.findElements(By.xpath("(//table[@class='small'])[2]"));
//  for (int i = 0; i < uponTheChartOfCompainsList.size(); i++) {
//	WebElement uponTheChartOfCompainsList_Get = uponTheChartOfCompainsList.get(i);
//	String uponTheChartOfCompainsList_Text = uponTheChartOfCompainsList_Get.getText();
//	System.out.print(uponTheChartOfCompainsList_Text);
//}
//  List<WebElement> chartOfCompainsList = launch.findElements(By.xpath("//td[@class='lvtCol']//a"));
//  for (int i = 0; i < chartOfCompainsList.size(); i++) {
//	  WebElement chartOfCompainsList_Get = chartOfCompainsList.get(i);
//	  String chartOfCompainsList_Text = chartOfCompainsList_Get.getText();
//      System.out.print(chartOfCompainsList_Text+" ");
//  }
//     String textOfTable = launch.findElement(By.xpath("//table[@class='lvt small']")).getText();
//     System.out.println(textOfTable);
//     
//    List<WebElement> downChartOfCompainList = launch.findElements(By.xpath("//table[@class='lvt small']//tr"));
//      System.out.println(downChartOfCompainList.size()+" = size" );
//      for (int j = 1; j < downChartOfCompainList.size(); j++)       {
//    	  WebElement downChartOfCompainList_Get = downChartOfCompainList.get(j);
//    	  String downChartOfCompainList_Text = downChartOfCompainList_Get.getText();
//    	  System.out.print(downChartOfCompainList_Text);
//      }System.out.println();
//      
//      List<WebElement> downChartOfCompainListWordBYWord = launch.findElements(By.xpath("//table[@class='lvt small']//tr/td"));
//      System.out.println(downChartOfCompainListWordBYWord.size()+" = size" );
//      for (int k = 1; k < downChartOfCompainListWordBYWord.size(); k++)       {
//    	  WebElement downChartOfCompainListWordBYWord_Get  =  downChartOfCompainListWordBYWord.get(k);
//    	  String downChartOfCompainListWordBYWord_Text    =   downChartOfCompainListWordBYWord_Get.getText();
//    	  Thread.sleep(2000);
//    	  System.out.print(downChartOfCompainListWordBYWord_Text+"  ");
//      }   
//    List<WebElement> allTab = launch.findElements(By.xpath("//td[contains(@class,'Selected')]"));  
//    for (int i = 0; i < allTab.size(); i++) {
//  	  allTab = launch.findElements(By.xpath("//td[contains(@class,'Selected')]"));
//  	  WebElement allTabGet = allTab.get(i);
//  	  String allTabText = allTabGet.getText();
//  	  System.out.println(allTabText);
//  	  allTabGet.click();
//   
//  	  List<WebElement> allTabSubModule =launch.findElements(By.xpath("//td[contains(@class,'SelTab')]"));
//  	  for (int j = 0; j < allTabSubModule.size(); j++) {
//  		  allTabSubModule =launch.findElements(By.xpath("//td[contains(@class,'SelTab')]"));
//  		  WebElement allTabSubModuleGet = allTabSubModule.get(j);
//  		  String allTabSubModuleText = allTabSubModuleGet.getText();
//  		  System.out.println(allTabSubModuleText);
//  		allTabSubModuleGet.click();
//           // launch.navigate().refresh();
//		}
//  	  System.out.println();
//	}      
////    launch.findElement(By.xpath("//img[@src='themes/images/orgshar.gif']")).click();
////    String text = launch.findElement(By.xpath("//img[@src='themes/images/orgshar.gif']")).getAttribute("title");
////    System.out.println(text);
//    
//    WebElement dropdown = launch.findElement(By.xpath("//select[@id='layoutSelect']"));
//    Select drop=new Select(dropdown);
//    drop.selectByIndex(1);
//    launch.findElement(By.xpath("//div[@id='changeLayoutDiv']//input[@id='savebtn']")).click();
//
//    WebElement computer = launch.findElement(By.xpath("//img[@title='Open All Menu...']"));
//    computer.click();
//    
//   
//      List<WebElement>topElement = launch.findElements(By.xpath("//b[contains(text(),' Top ')]"));
//   
//      for (int i = 0; i < topElement.size() ; i++) {
//    	
//    	WebElement top = topElement.get(i);
//        String topText = top.getText();
//        System.out.println(topText);
//         }
//         System.out.println();
//         List<WebElement>totalTop = launch.findElements(By.xpath("//td[@class='homePageMatrixHdr']/b"));
//         for (int i = 0; i < totalTop.size(); i++) {
//    	 WebElement totltop = totalTop.get(i);	
//    	 String totalTopText = totltop.getText();
//    	 System.out.println(totalTopText+"="+i);
//	     }
//         System.out.println();
//         Thread.sleep(5000);
//         List<WebElement> NoData = launch.findElements(By.xpath("//div[text()='No Data Found']"));
//         System.out.println (NoData.size()+" This is size of no data");
//         for (int i = 0; i < NoData.size(); i++) {
//    	   WebElement NodataFoud = NoData.get(i);
//    	   String NodataText = NodataFoud.getText(); 
//		   System.out.println(NodataText);
//	    }
//        launch.findElement(By.xpath("//a[text()='Marketing']")).click();
//        
////        launch.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
////        launch.findElement(By.xpath("//input[@class=\"detailedViewTextBox\"]")).sendKeys("Ronaldo");
////        launch.findElement(By.xpath("(//input[@value=\"  Save  \"])[2]")).click();
//        
//        List<WebElement>LastName = launch.findElements(By.xpath("//a[@title='Campaigns']"));
//        for (int i = 0; i < LastName.size(); i++) {
//    	WebElement lastname = LastName.get(i);
//    	String NameLast = lastname.getText();
//    	System.out.println(NameLast+"="+i);
//	    }
//        List<WebElement> check = launch.findElements(By.xpath("//input[@name='selected_id']"));
//        for (int i = 0; i <check.size(); i++) {
//        check.get(i).click();
//        }
//        List<WebElement> Alfabates = launch.findElements(By.xpath("//td[@class='searchAlph']"));
//        for (int i = 0; i < Alfabates.size(); i++) {
//        Alfabates.get(i).click();
//		}
//        launch.findElement(By.xpath("//td[@class=\"level2UnSelTab\"]//a[text()='Leads']")).click();
//  
//        List<WebElement> leads = launch.findElements(By.xpath("//input[@name=\"selected_id\"]"));
//        for (WebElement webElement : leads) {
//        	webElement.click();
//		}
//        List<WebElement> lastname = launch.findElements(By.xpath("//td//span[@vtfieldname=\"lastname\"]//parent::td//a"));
//        
//        for (WebElement webElement : lastname) {
//		     String lastName = webElement.getText();
//		     System.out.println(lastName);
//		}
//        List<WebElement> alfaButton = launch.findElements(By.xpath("//td[@class=\"searchAlph\"]"));
//        for (int i = 0; i <alfaButton.size(); i++) {
//        	 alfaButton.get(i).click();
//		}
//       List<WebElement> LastFirsttext=launch.findElements(By.xpath("//a[@class=\"listFormHeaderLinks\"]"));
//        for (int i = 0; i < LastFirsttext.size(); i++) {
//			WebElement LastFirsttext_1 = LastFirsttext.get(i);
//			String Text = LastFirsttext_1.getText();
//			System.out.println(Text);
//		}
//        String supportText = launch.findElement(By.xpath("//a[text()='Support']")).getText();
//        System.out.println(supportText);
//        launch.findElement(By.xpath("//a[text()='Support']")).click();
//        
//      launch.findElement(By.xpath("//img[@title='Chat...']")).click();
//    Dimension clockSize = launch.findElement(By.xpath("//img[@title=\"Show World Clock...\"]")).getSize();
//    int clockhight = clockSize.getHeight();
//    int clockwidth = clockSize.getWidth();
//    System.out.println("hight ="+clockhight+",width"+clockwidth);
//    if(clockhight==27 && clockwidth==27) {
//    	System.out.println("it is right ");
//    }else {
//    	System.out.println("it is wrong");
//    }
//        launch.findElement(By.xpath("//img[@title='Open Calculator...']")).click();
//        Thread.sleep(10000);
//        launch.findElement(By.xpath("//input[@name='calc5']")).click();////input[@name=\"calc5\"]
//        launch.findElement(By.xpath("//input[@name=\"multiply\"]")).click();
//        launch.findElement(By.xpath("//input[@name=\"calc6\"]")).click();
//        launch.findElement(By.xpath("//input[@ name=\"equal\"]")).click();
//        launch.findElement(By.xpath("//img[@onclick=\"fninvsh('calc')\"]")).click();
//        
//        launch.findElement(By.xpath("//img[@title=\"Show World Clock...\"]")).click();
//        Thread.sleep(2000);
//        launch.findElement(By.xpath("//img[@onclick=\"fninvsh('wclock')\"]")).click();
//        
////        launch.findElement(By.xpath("//td[@class=\"small\"]//a[contains(text(),' Ticket')]")).click();
////        launch.findElement(By.xpath("//textarea[@name=\"ticket_title\"]")).sendKeys("it is ticket for Mumbai to Delhi");
////        launch.findElement(By.xpath("(//input[@value=\"  Save  \"])[2]")).click();
//        
//   
////      launch.findElement(By.xpath("//img[@title=\"Create Trouble Tickets...\"]")).click();
////      launch.findElement(By.xpath("//textarea[@name=\"ticket_title\"]")).sendKeys("akshay kumar");
//////      launch.findElement(By.xpath("(//input[@class=\"crmbutton small save\"])[2]")).click();  
	}
}
