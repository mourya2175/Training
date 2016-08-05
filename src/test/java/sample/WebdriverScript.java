package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverScript {
	public WebDriver driver;

	@Test
	public void testAlert_Test() throws InterruptedException {
		driver.get("http://www.kesinenitravels.com/Index.aspx");
		driver.findElement(By.id("ctl00_ibtnCheckFare")).click();
		//click on search button
		driver.findElement(By.id("ctl00_cpEndUserMain_ibtnSearch")).click();
		//get alert message
		String aMsg=driver.switchTo().alert().getText();
		System.out.println("Alert message is : "+aMsg);
		//handle alert
		driver.switchTo().alert().accept();
		driver.findElement(By.id("ctl00_ibtnLogIn")).click();
		
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
