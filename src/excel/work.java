package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class work {
	
	public static void main (String[]args) throws IOException, InterruptedException {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\srika\\OneDrive\\Desktop\\shree\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		FileInputStream ip=new FileInputStream("C:\\Users\\srika\\.eclipse\\Selenium\\excel\\levitica.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount =sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow currentRow=sheet.getRow(i);
			String FirstName=currentRow.getCell(0).getStringCellValue();
			System.out.println(FirstName);
		    String LastName	=currentRow.getCell(1).getStringCellValue();
		    System.out.println(LastName);
		    String Address=currentRow.getCell(2).getStringCellValue();
		    System.out.println(Address);
		    String Email=currentRow.getCell(3).getStringCellValue();
		    System.out.println(Email);
		   // String Phone=currentRow.getCell(4).getStringCellValue();
		  //  System.out.println(Phone);
		    String Password=currentRow.getCell(5).getStringCellValue();
		    System.out.println(Password);
		    String ConformPassword=currentRow.getCell(6).getStringCellValue();
		    System.out.println(ConformPassword);


		    
		    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
		    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
		    driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
		    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
		  //  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(Phone);
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		    driver.findElement(By.id("checkbox1")).click();
		    driver.findElement(By.id("msdd")).click();
			  Thread.sleep(2000);

		  driver.findElement(By.xpath("//a[text()='Czech']")).click();
		  Thread.sleep(4000);
		   
		  Select drop=new Select(driver.findElement(By.xpath("(//select[@type='text'])[1]")));
		  drop.selectByVisibleText("Adobe Photoshop");
		  Thread.sleep(4000);
		 // Select country=new Select(driver.findElement(By.id("countries")));
		 // country.selectByIndex(0);
		 // Thread.sleep(4000);
		 // driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).click();
		//  driver.findElement(By.xpath("//span[text()='India']")).click();
		//  Thread.sleep(2000);
		  Select year=new Select(driver.findElement(By.xpath("//select[@id=\"yearbox\"]")));
		  year.selectByVisibleText("1947");
		  
		  Select month=new Select(driver.findElement(By.xpath("(//select[@type=\"text\"])[4]")));
		  month.selectByVisibleText("December");
		  
		  Select day=new Select(driver.findElement(By.xpath("(//select[@type=\"text\"])[5]")));
		  day.selectByVisibleText("8");
		  
		  driver.findElement(By.id("firstpassword")).sendKeys(Password);
		  driver.findElement(By.id("secondpassword")).sendKeys(ConformPassword);
		  
		  Thread.sleep(4000);
		  driver.findElement(By.id("submitbtn")).click();

		  
		   
		  
		   
		    
		    
		}
		workbook.close();
	}

}
