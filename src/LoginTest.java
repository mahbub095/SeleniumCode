import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		driver.get("http://automationpractice.com");
		
		WebElement element= driver.findElement(By.className("login"));
		element.click();
		//email & password sendkeys
		element=driver.findElement(By.id("email"));
		element.sendKeys("admin@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("test123456");
		

	}

}
