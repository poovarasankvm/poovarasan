package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();	
		System.out.println(driver.findElement(By.className("myradio")).isSelected());	
		System.out.println(driver.findElement(By.xpath("//input[contains(@value,'1') and contains(@name,'news')]")).isSelected());		
		
		
	}

}
