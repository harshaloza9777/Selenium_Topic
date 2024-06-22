package Topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\Git_Assesment\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//for opening a browser
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(".//screenshot/screen.png"));

	}

}
