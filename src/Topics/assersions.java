package Topics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assersions {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\Git_Assesment\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//for opening a browser
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			String actualTitle=driver.getTitle();
			String ExceptedTitle="Google";
			assertEquals(actualTitle, ExceptedTitle);
		//	System.out.println(driver.getTitle());
  }
}
