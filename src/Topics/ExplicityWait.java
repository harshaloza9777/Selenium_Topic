package Topics;

import java.time.Duration;
//import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.appium.java_client.functions.ExpectedCondition;

public class ExplicityWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\shree\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("srikanth");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("kurella");
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@type='submit']")));

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
