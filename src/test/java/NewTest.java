import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
		driver.findElement(By.name("q")).sendKeys("Emerson", Keys.ENTER);
		Assert.assertEquals(true, driver.getTitle()!= null);
  }
  
  @Test
  public void Test2()
  {
	  driver.findElement(By.name("q")).sendKeys("Girish Gaikwad", Keys.ENTER);
		Assert.assertEquals(true, driver.getTitle()!= null);
  }
  
  @BeforeMethod
  public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
