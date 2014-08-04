package ChuangYuan.zwq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class NewTest {
	private WebDriver driver = null;
	@Test
	public void fapiao() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://qa1-eng.kargotest.com/KargoInvoice/control/main");
	//  WebElement element = driver.findElement(By.name("q"));
	//  element.sendKeys("hello Selenium!");
	  driver.findElement(By.cssSelector("a.a_row > img")).click();
	//  element.submit();
	  try{
		  Thread.sleep(3000);
		  } catch (InterruptedException e){
			  e.printStackTrace();
		  }
	  System.out.print("Page title is: " + driver.getTitle());
	  driver.quit();
	  
  }
}
