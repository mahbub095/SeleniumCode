import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventSubmit {

    
	WebDriver driver;
	public void openbrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
			driver = new ChromeDriver();
	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			formtest();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void formtest() {
	 
		try {
			driver.navigate().to("LInk");	 
//	    	WebElement formlist = driver.findElement(By.xpath("//input[@id='user_login']"));	
//	        for (int i=0; i<1; i++) {	
//	        	formlist.click (); 	
	        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("???");	
	        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("???");	
	        driver.findElement(By.xpath(" //input[@id='wp-submit']")).click();	
	       
	        	 // driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Test Title"); 
	           driver.findElement(By.xpath("//a[@class='current']")).click();   
	         //a[@class='page-title-action']
	           driver.findElement(By.xpath("//*[contains(@class, 'page-title-action')]")).click(); 
	           driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Test Title 5"); 
	           driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
	           
	           driver.findElement(By.name("startdate")).click();
	           driver.findElement(By.linkText("27")).click();
	           driver.findElement(By.name("enddate")).click();
	           driver.findElement(By.linkText("31")).click();
	           driver.findElement(By.name("location")).sendKeys("USA");
	           driver.findElement(By.name("city")).sendKeys("Newyork");
	           driver.findElement(By.name("zip")).sendKeys("884842");
	           driver.findElement(By.name("cost")).sendKeys("500");	
	           driver.findElement(By.name("age")).sendKeys("500");
	          
	           //driver.findElement(By.xpath("//*[@id='publish']")).click();  
	          // driver.findElement(By.id("gform_submit_button_33")).click();   
	        
	      
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventSubmit myObj = new EventSubmit();
		myObj.openbrowser();
	}
}
