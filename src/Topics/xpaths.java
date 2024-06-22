package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\Git_Assesment\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();//for opening a browser
				driver.manage().window().maximize();
				driver.get("https://www.hsbc.co.in/");
				
driver.findElement(By.xpath("/html/body/div[1]/div/header/div[4]/div/div[1]/div/div/div/div/div/nav/ul/li[5]/div")).click();			
	}

}
