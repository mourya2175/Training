package sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Windows_Test {
	public WebDriver driver;

	@Test
	public void testWindows_Test() throws InterruptedException {
		driver.get("http://www.rightstart.com/");
		driver.findElement(By.linkText("Email Signup")).click();
		String pwin=driver.getWindowHandle();
		System.out.println("Parent winodw handle is : "+pwin);
		//click on our blog which will open new tab/window
		driver.findElement(By.linkText("Our Blog")).click();
		//get window handles
		Set<String> windows=driver.getWindowHandles();
		//remove parent window from windows set
		windows.remove(pwin);
		driver.switchTo().window(windows.iterator().next());
		driver.findElement(By.linkText("About")).click();
		//close child window/tab
		driver.close();
		//switch to parent window
		driver.switchTo().window(pwin);
		//perform actions on parent window
		driver.findElement(By.name("signup[eMail]")).sendKeys("parent window");
		
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
