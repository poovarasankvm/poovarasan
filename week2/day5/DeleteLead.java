package week2.day5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.linkText("Phone")).click();
    driver.findElement(By.name("phoneNumber")).sendKeys("9361941985");
    driver.findElement(By.xpath("//button[contains(@class,'x-btn-text')and contains(@id,'ext-gen334')]")).click();
    driver.findElement(By.xpath("(//a[id=ext-gen923])")).click();
    driver.findElement(By.className("subMenuButtonDangerous")).click();
    
    
    
}

}
