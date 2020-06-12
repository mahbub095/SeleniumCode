import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginFormTest {

	private WebDriver driver;
//	private CreateAccountForm createAccountForm;
//	private SignInForm signin;
//	private Account account;

	@BeforeClass
	public void setup() {
		WebDriver driver = Base.getDriver();
	

		//createAccountForm = new CreateAccountForm(driver);
		//signin = new SignInForm(driver);
		//account = new Account(driver);

		String baseUrl = "http://automationpractice.com/index.php?controller=authentication";
		driver.manage().window().maximize();
		driver.get(baseUrl);
}
}
