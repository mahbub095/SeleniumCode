import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {
	WebDriver driver;	
//	ArrayList locatorList = new ArrayList<By>();
 
	public void invokeBrowser() {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://testword.test/");
		System.out.println(" Open Application");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getNavigate();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void getNavigate() {

		try {
          System.out.println("Testing Proecedure");
		  driver.findElement(By.linkText("Register or Sign in")).click();
   
		  WebElement email = driver.findElement(By.linkText("Login"));
	        for (int i=0; i<1; i++) {											
	        	email.click(); 
	        	driver.findElement(By.id("username")).sendKeys("admin");
	        	driver.findElement(By.id("password")).sendKeys("admin");
	        	driver.findElement(By.xpath("//button[text()='Login']")).click();
	        	driver.findElement(By.linkText("Home")).click();
	        	driver.findElement(By.linkText("Accessories")).click();
	        	driver.findElement(By.xpath("//h2[contains(text(), 'Amkov CDC3 7inch TFT Screen 18 CMOS')]")).click();
	        	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	        	driver.findElement(By.linkText("View cart")).click();
	        	driver.findElement(By.linkText("Proceed to checkout")).click();
	        	driver.findElement(By.xpath("//*[@id='terms']")).click();
	        	driver.findElement(By.xpath("//*[@id='place_order']")).click();
	      	 
	        }
		}
	        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecommerce myObj = new Ecommerce();
		myObj.invokeBrowser();
				
	}

}
