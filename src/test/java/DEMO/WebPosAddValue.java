package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebPosAddValue {
	private WebDriver iewb = null;
	private DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");
	private ParseProperties data = new ParseProperties(System.getProperty("user.dir")+"\\tool\\data.properties"); 
	private ParseProperties locator = new ParseProperties(System.getProperty("user.dir")+"\\tool\\loc.properties"); 
	
	@BeforeClass
	public void startIE(){
		System.setProperty("webdriver.ie.driver", projectpath+"/tool/IEDriverServer.exe");
	    caps = DesiredCapabilities.internetExplorer();
	    caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS,false);
	    caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	    caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
	    caps.setCapability("ignoreZoomSetting", true);
	    iewb = new InternetExplorerDriver(caps);  

	iewb.get("https://qa1-eng.kargotest.com/webpos/control/checkLogin?merchant=00062000000");
	WebElement element = iewb.findElement(By.id("username"));
	element.sendKeys("000541");
	iewb.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("123456");
	iewb.findElement(By.xpath("//a[@class='submit button pie_first-child']")).submit();
	iewb.findElement( By.xpath("//a[@id='btn_prepaid']")).click();
	iewb.findElement(By.xpath("//a[text()='输入卡号']")).click();
	iewb.findElement(By.xpath(locator.getValue("card"))).sendKeys(data.getValue("cardNo"));
	iewb.findElement(By.xpath("//a[text()='继续']")).click();
	try {
		Thread.sleep(5000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Test
	public void addValue(){
		iewb.findElement(By.xpath("//a[text()='充值']")).click();
		iewb.findElement(By.xpath("//input[@id='input_amount']")).sendKeys("10");
		iewb.findElement(By.xpath("//a[text()='提交']")).click();
		iewb.findElement(By.xpath("//a[text()='完成']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    	
  @AfterClass
	public void releaseIEDriver(){
		iewb.quit();
	}
		
	}
