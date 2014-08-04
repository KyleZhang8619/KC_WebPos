package DEMO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebdriver {
	public static void main(String[] args){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.submit();
		System.out.print("Page title is" + driver.getTitle());
		
		
		
		
		
		
	}
}
