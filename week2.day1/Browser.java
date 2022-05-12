package week2day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
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
	String title=driver.getTitle();
	System.out.println(title);
	String link=driver.getTitle();
	System.out.println(link);
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("zoho");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("poovarasan");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("siva");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Accenture");
	driver.findElement(By.name("submitButton")).click();
	
	
}
}
