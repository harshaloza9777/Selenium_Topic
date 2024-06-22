package Topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>child=driver.getWindowHandles();
		System.out.println(child);
		
		for(String childWindow:child) {
			if(!childWindow.equals(parent)) {//!=not
				driver.switchTo().window(childWindow);
				Thread.sleep(4000);
				driver.findElement(By.id("firstName")).sendKeys("kurella");
				driver.findElement(By.id("lastName")).sendKeys("Srikanth");
				driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
				driver.findElement(By.id("englishchbx")).click();
				driver.findElement(By.id("email")).sendKeys("sssss@gmail.com");
				driver.findElement(By.id("password")).sendKeys("SSSSSSS");
			//	driver.findElement(By.id("clearbtn")).click();

				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("Levitica");
		driver.quit();
	}

}
