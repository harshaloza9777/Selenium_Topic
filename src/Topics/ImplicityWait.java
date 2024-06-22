package Topics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicityWait {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\shree\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("srikanth");
		driver.findElement(By.id("sssss")).click();
		
	}

}
