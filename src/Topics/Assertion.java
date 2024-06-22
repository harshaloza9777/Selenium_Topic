package Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hottools.com/");
		
		String ExpectedTitle="Hot Tools Professional | Best Hair Appliances | Hot Tools";
		String ActualTitle=driver.getTitle();
		System.out.println("The title of the app"+ ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
