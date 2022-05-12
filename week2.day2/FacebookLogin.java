package wee2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9566618554");
		driver.findElement(By.id("pass")).sendKeys("arasan95666");
		driver.findElement(By.name("login")).click();
		
		
	}

}
