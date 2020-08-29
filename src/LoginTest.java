import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		driver.get("http://wplearning.test/wp-admin");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin");
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.linkText("")).click();
		
		

	}

}
