package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GetTitle_Test {
	public WebDriver driver;
	@Test
	public void testCheckBoxes_Test() {
		driver.get("http://www.rightstart.com/");
		//get title of the page
		String title=driver.getTitle();
		System.out.println("Home Pge title is : "+title);
		driver.findElement(By.linkText("Email Signup")).click();
		String emailTitle=driver.getTitle();
		System.out.println("Email Signup Page : "+emailTitle);
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
