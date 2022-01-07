package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// findElement
		driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		WebElement searchBox1 = driver.findElement(By.name("q"));
		searchBox1.sendKeys("Selenium" + Keys.ENTER);
		
		driver.get("https://trytestingthis.netlify.app/");
		//Get all the elements available with tag name 'select'
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		
		for(WebElement element: elements) {
			System.out.println(element.getText());
		}
		
		//find element within element
		driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("ABCD"+ Keys.ENTER);
		
		//get active element
		driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("selenium");
		String title = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		
		//get tagname, text, css ...
		driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		WebElement searchBox = driver.findElement(By.name("q"));
		String tagName = searchBox.getTagName();
		String text = searchBox.getText();
		String cssValue = searchBox.getCssValue("font");
		System.out.println(tagName + " | " + text + " | " + cssValue);
		
		//check element is enable, is selected
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		
	}
}
