package WEEK2.DAY1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		// from sign up page

		driver.findElement(By.name("firstname")).sendKeys("Kew");
		driver.findElement(By.name("lastname")).sendKeys("John");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("Kew_John@123");

		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByIndex(10);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2000");
		
		driver.findElement(By.name("sex")).click();
		
		
		driver.findElement(By.name("websubmit")).click();
	}

}
