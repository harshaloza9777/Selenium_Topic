package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;
	
	@BeforeMethod
	public void startTest() {
	//	System.getProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\shree\\chromedriver-win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=0)
	public void test1() throws Exception {
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(4000);
		Select drop=new Select(driver.findElement(By.id("day")));
		Thread.sleep(4000);
		drop.selectByIndex(4);
		driver.close();
	}
	@Test(priority=1)
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(4000);
		Select drop=new Select(driver.findElement(By.id("month")));
		Thread.sleep(4000);

		drop.selectByValue("8");
		driver.close();
	}
	@Test(priority=2)
	public void test3() throws Exception {
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(4000);

		Select drop=new Select(driver.findElement(By.id("year")));
		Thread.sleep(4000);

		drop.selectByVisibleText("2020");
		//driver.close();
	}
	
}
