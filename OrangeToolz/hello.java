import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("http://159.89.38.11/login");
    driver.manage().window().setSize(new Dimension(1225, 697));
    driver.findElement(By.id("email-1")).click();
    driver.findElement(By.id("password-1")).sendKeys("8Kh8nTe*^jdk");
    driver.findElement(By.id("email-1")).sendKeys("test@orangetoolz.com");
    driver.findElement(By.id("m_login_signin_submit")).click();
    driver.findElement(By.cssSelector(".dt-side-nav__item:nth-child(4) .dt-side-nav__text")).click();
    driver.findElement(By.linkText("Add Contact")).click();
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
}
