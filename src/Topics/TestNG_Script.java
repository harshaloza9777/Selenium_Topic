package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Script {
	WebDriver driver;
  @BeforeMethod
  public void Initilization() {
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
	  
  }
  @Test(priority=0)
  public void execute() throws Exception {
	  Thread.sleep(4000);
	  WebElement frame=	driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div/div/div[4]/button")).click();
		Thread.sleep(4000);
		//driver.close();
  }
  @Test(priority=1)
  public void clickOnLink() throws Exception {
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("(//div[@class='canvas-middle'])[1]")).click();
  }
  @AfterMethod
  public void closeAll(){
	  driver.close();
  }
}
