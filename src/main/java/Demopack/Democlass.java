package Demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Democlass {
	@Test
	public void url(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String url= driver.getCurrentUrl();
		System.out.println(url);
	}
}
