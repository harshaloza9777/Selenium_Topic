package excel;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel {

	static HashMap<String,String> data(){
		HashMap <String, String>dt=new HashMap<String,String>();
		dt.put("1", "Srikanth@Kurella");
		dt.put("2", "Ku");
		dt.put("3", "srikanth@gmail.com");
		return dt;
	}
public static void main(String[]args) {
	
	System.getProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\shree\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	String cred=data().get("1");
	String[] arr=cred.split("@");
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(arr[0]);
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(arr[1]);
}

}
