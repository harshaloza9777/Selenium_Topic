package Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] browsers= {"Chrome", "Firefox","Edge"};
		WebDriver driver= null;
		for(int i=0;i<browsers.length;i++)
		{
			//capturing the data
			String browsername= browsers[i];
			if(browsername.equalsIgnoreCase("chrome"))
			{
				driver= new ChromeDriver();
				Thread.sleep(1000);
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				driver= new FirefoxDriver();
				Thread.sleep(1000);
			}
			else if(browsername.equalsIgnoreCase("edge"))
			{
				driver= new EdgeDriver();
				Thread.sleep(1000);
			}
			driver.get("https://www.facebook.com");
	
		}
		//opening application

	}

}
