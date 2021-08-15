package WEEK2.DAY1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 	
		// filling the form
		driver.findElement(By.name("UserFirstName")).sendKeys("Russell");
		driver.findElement(By.name("UserLastName")).sendKeys("Cameron");
		
		driver.findElement(By.name("UserEmail")).sendKeys("russell.cameron@testleaf.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Test Leaf");
		
		WebElement jt= driver.findElement(By.name("UserTitle"));
		Select jt1 = new Select(jt);
		jt1.selectByValue("IT_Manager_AP");
		
		WebElement emp= driver.findElement(By.name("CompanyEmployees"));
		Select emp1 = new Select(emp);
		emp1.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		WebElement Country= driver.findElement(By.name("CompanyCountry"));
		Select c1 = new Select(Country);
		c1.selectByValue("IN");
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();
		
	}

}
