package Topics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> element=driver.findElements(By.tagName("div"));
		for (int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
		}
		
	}

}
