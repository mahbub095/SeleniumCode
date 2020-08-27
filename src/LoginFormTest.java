import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormTest {
	private WebDriver driver;
	
	public void setup() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
		driver = new ChromeDriver();

		 

		String baseUrl = "http://automationpractice.com/index.php?controller=authentication";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

}
