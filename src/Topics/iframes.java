package Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement frame=	driver.findElement(By.xpath("//iframe[@frameborder='0']"));
	driver.switchTo().frame(frame);
		Thread.sleep(4000);
		
	WebElement video=	driver.findElement(By.xpath("//button[@aria-label='Play']"));
	video.click();
	if(video.isSelected()) {
		System.out.println("video has been played sucessfully");
	}else {
		System.out.println("not played");
	}
	}

}
