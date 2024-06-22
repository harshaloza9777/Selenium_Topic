package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;
	
	@BeforeMethod//It should be run first
	public void method1() {
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
	}
	@Test(priority=0)
	public void method2() throws Exception {
		
		WebElement frame=driver.findElement(By.xpath("(//iframe[@frameborder='0'])[1]"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
	}
	@Test(priority=1)
	public void method3() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@AfterMethod
	public void method4() {
		driver.close();
	}
	
}
