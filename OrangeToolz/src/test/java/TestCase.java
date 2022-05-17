import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  private StringBuffer verificationErrors = new StringBuffer();
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Afia\\src\\drivers\\geckodriver.exe");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://159.89.38.11/login");
    driver.manage().window().setSize(new Dimension(1225, 697));
    driver.findElement(By.id("email-1")).click();
    driver.findElement(By.id("email-1")).sendKeys("test@orangetoolz.com");
    driver.findElement(By.id("password-1")).click();
    driver.findElement(By.id("password-1")).sendKeys("8Kh8nTe*^jdk");
    driver.findElement(By.id("m_login_signin_submit")).click();
    Thread.sleep(3000);

    driver.findElement(By.xpath("//span[contains(text(),'Contact Manage')]")).click();
    driver.findElement(By.cssSelector(".add-new-group > span")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("orange");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) > .form-control")).sendKeys("hello");
    driver.findElement(By.id("submit-group")).click();
    driver.findElement(By.name("number")).click();
    driver.findElement(By.name("number")).sendKeys("1234567891");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("test@orangetoolz.com");
    driver.findElement(By.name("first_name")).click();
    driver.findElement(By.name("first_name")).sendKeys("orange");
    driver.findElement(By.name("last_name")).click();
    driver.findElement(By.name("last_name")).sendKeys("toolz");
    driver.findElement(By.name("birthday")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) > .day:nth-child(6)")).click();
    driver.findElement(By.name("state")).click();
    driver.findElement(By.name("state")).sendKeys("dhaka");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).sendKeys("dhaka");
    driver.findElement(By.name("zip")).click();
    driver.findElement(By.name("zip")).sendKeys("1234");
    driver.findElement(By.name("country")).click();
    driver.findElement(By.name("country")).sendKeys("Bangladesh");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys("dhaka1234");
    driver.findElement(By.cssSelector(".btn:nth-child(13)")).click();
    driver.findElement(By.cssSelector(".dt-side-nav__item:nth-child(11) .dt-side-nav__text")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
