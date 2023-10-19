package com.obsqura.tests;

	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;

	import com.obsqura.Exception.NoBrowserFoundException;
import com.obsqura.pages.ContactUsPage;
import com.obsqura.pages.ExpenseCategoryPage;
	import com.obsqura.pages.HomePage;
	import com.obsqura.pages.ListProductPage;
	import com.obsqura.pages.ListCategoryPage;
import com.obsqura.pages.ListDeliveryBoyPage;
import com.obsqura.pages.ListLocationPage;
import com.obsqura.pages.LoginPage;
	import com.obsqura.pages.ManagePaymentMethods;
	import com.obsqura.utilities.TestProperties;

	public class BaseTest {
		WebDriver driver;
		Properties prop;

		@Parameters({ "browserName" })
		@BeforeClass(alwaysRun = true)
		public void InitializeDriver(@Optional String browserName) throws IOException {
			prop = TestProperties.GetProperties();
			
			if(browserName==null || browserName.isEmpty()) {
			browserName=prop.getProperty("browserName");
			}
			
			String Environment = prop.getProperty("Environment");
			String URL = prop.getProperty(Environment);

			getDriver(browserName);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(URL);
			InitializePages();

		}

		public WebDriver getDriver(String browserName) {
			switch (browserName.toUpperCase()) {
			case "CHROME":
				driver = new ChromeDriver();
				break;
			case "FIREFOX":
				driver = new FirefoxDriver();
				break;
			case "EDGE":
				driver = new EdgeDriver();
				break;
			default:
				throw new NoBrowserFoundException("There is no such browser like "+browserName);
			
			}
			return driver;
		}


	public LoginPage lp;
	public HomePage hp;
	public ExpenseCategoryPage ecp;
	public ManagePaymentMethods up;
	public ListProductPage lpp;
	public ListCategoryPage lcp;
	public ListDeliveryBoyPage ldp;
	public ListLocationPage llp;
	   public ContactUsPage cp;

	public void InitializePages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		ecp = new ExpenseCategoryPage(driver);
		up = new ManagePaymentMethods(driver);
		lpp = new ListProductPage(driver);
		lcp = new ListCategoryPage(driver);
		ldp = new ListDeliveryBoyPage(driver);
	    llp = new ListLocationPage(driver);
	    cp = new ContactUsPage(driver);
		

	}

	@AfterClass
	public void TearDown() {
		// driver.quit();
	}
}