import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectorySubmit {

	
	WebDriver driver;
	public void openbrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			DirectorySubmit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DirectorySubmit() {
	 
		try {
			driver.navigate().to("WebLink");
//			  WebElement login = driver.findElement(By.xpath("//input[@id='user_login']"));
//		        for (int i=0; i<1; i++) {											
//		        	login.sendKeys("webpublisherpro"); 
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("???"); 
	        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("???");	
	        driver.findElement(By.xpath(" //input[@id='wp-submit']")).click();	    
	        driver.findElement(By.linkText("Camps")).click();
	        driver.findElement(By.xpath("//a[@class='page-title-action'][contains(text(),'Add New Camp')]")).click();    
	        driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Test Title 5"); 
	        driver.findElement(By.xpath("//textarea[@id='editor_notes']")).sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
            driver.findElement(By.name("_street_address")).sendKeys("USA");
	        driver.findElement(By.name("_city")).sendKeys("USA");
	        driver.findElement(By.name("_state")).sendKeys("A");
	        driver.findElement(By.name("_zip")).sendKeys("88665");
	        driver.findElement(By.name("_phone")).sendKeys("813454646");
	        driver.findElement(By.name("_email")).sendKeys("admin123@gmail.com");
	        driver.findElement(By.name("_facebook")).sendKeys("fb.com");
	        driver.findElement(By.name("_sunday")).sendKeys("8.00AM - 8.00PM");	
	        driver.findElement(By.xpath("//div[@id='wpfront-scroll-top-container']//img")).click();
	        driver.findElement(By.name("publish")).click();
	       
	      
		//}
		  }
		catch (Exception e) {
			e.printStackTrace();
		}
	}
 
		   
	public static void main(String[] args)     {
		// TODO Auto-generated method stub
		DirectorySubmit obj =new DirectorySubmit();
		obj.openbrowser();
	}

}
