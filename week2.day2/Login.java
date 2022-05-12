package wee2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("zoho");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("poovarasan");
		WebElement webElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1=new Select(webElement);
		dd1.selectByValue("LEAD_COLDCALL");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("siva");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
		WebElement webElement2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2=new Select(webElement2);
		dd2.selectByValue("IND_SOFTWARE");
		WebElement webElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3=new Select(webElement3);
		dd3.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("73");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I Am Testing Engineer");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("I Am Good Tester");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		WebElement webElement4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd4=new Select(webElement4);
		dd4.selectByVisibleText("Catalog Generating Marketing Campaigns");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1222");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ABBV");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("936");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("poovarasankvm95666@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9361941985");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.psaonline.utiitsl.com/psaonline/showLogin");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Poovarasan");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Kunnavakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603109");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("TKM");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Siva");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kunnavakkam");
		WebElement webElement5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd5=new Select(webElement5);
		dd5.selectByValue("IND");
		WebElement webElement6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6=new Select(webElement6);
		dd6.selectByValue("IN-TN");
		driver.findElement(By.className("smallSubmit")).click();
		String val=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(val);
		System.out.println(driver.getTitle());

			
		
	}

}
