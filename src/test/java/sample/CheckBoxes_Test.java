package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CheckBoxes_Test {
	public WebDriver driver;
  @Test
  public void testCheckBoxes_Test() {
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.linkText("Email Signup")).click();
	  driver.findElement(By.xpath("//input[@name='signup[eMail]']")).sendKeys("selenium");
	  driver.findElement(By.cssSelector("input[id='signup:PrefOnlinePromo']")).click();
	  driver.findElement(By.xpath("//input[@value='Subscribe to the Right Start Insider!']")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
