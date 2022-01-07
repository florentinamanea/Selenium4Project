package test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {
	public static void main(String[] args) {
		//PageLoadStrategy NORMAL
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		driver.quit();
		
		//PageLoadStrategy EAGER
		ChromeOptions options1 = new ChromeOptions();
		options1.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver(options1);
		
		driver1.get("https://google.com");
		driver1.quit();
		
		//PageLoadStrategy NONE
		ChromeOptions options2 = new ChromeOptions();
		options2.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver(options2);
		
		driver2.get("https://google.com");
		driver2.quit();	
	}
}
