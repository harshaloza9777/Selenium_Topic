package Topics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prompt_alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(4000);
		alert.sendKeys("Levitica Technologies Pvt Ltd");
		Thread.sleep(4000);
		alert.accept();
	}

}
