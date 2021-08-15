package WEEK2.DAY1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement webuser = driver.findElement(By.id("username"));
		webuser.sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// locate the login button and click on it.
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElementByLinkText("Create Lead").click();
		// fill form
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("johns");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pauls");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("johns");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("johns");

		WebElement M1 = driver.findElement(By.name("marketingCampaignId"));
		Select M = new Select(M1);
		M.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.Johns");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/07/20");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50000000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("300");
		WebElement Currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select C1 = new Select(Currency);
		C1.selectByValue("USD");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("001");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Software company");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Read policy");

		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select S = new Select(Source);
		S.selectByValue("LEAD_EXISTCUST");

		WebElement Owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select O = new Select(Owner);
		O.selectByVisibleText("Partnership");

		WebElement I = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select I1 = new Select(I);
		I1.selectByIndex(5);

		// Contact Information

		WebElement webElement1 = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		webElement1.clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("521");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Johns");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Johns.Kew@testleaf.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Http://www.testleaf.com");
		// Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Johns");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Johns");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("BENKIM STREET");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("No 5A");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("California");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("32001");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("002");

		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByValue("CA");

		WebElement C = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select C2 = new Select(C);
		C2.selectByValue("USA");

		driver.findElement(By.className("smallSubmit")).click();

		WebElement value = driver.findElement(By.id("viewLead_firstName_sp"));
		String val1 = value.getText();
		System.out.println("first name: " + val1);

		String s3 = driver.getTitle();

		String s2 = "View Lead | opentaps CRM";

		if (s2.equals(s3)) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

	}

}
