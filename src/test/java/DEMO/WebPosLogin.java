package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebPosLogin {
		private WebDriver iewb = null;
		private DesiredCapabilities caps = null;
		private String projectpath = System.getProperty("user.dir");
		
		@BeforeClass
		public void startIE(){
			System.setProperty("webdriver.ie.driver", projectpath+"/tool/IEDriverServer.exe");
		    caps = DesiredCapabilities.internetExplorer();
		    caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS,false);
		    caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		    caps.setCapability("ignoreZoomSetting", true);
		    caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);   
		}
		@Test
		public void searchOnBaidu(){
			iewb = new InternetExplorerDriver(caps);
			iewb.get("https://qa1-eng.kargotest.com/webpos/control/checkLogin?merchant=00062000000");
			WebElement element = iewb.findElement(By.id("username"));
			element.sendKeys("000541");
			iewb.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("123456");
			//iewb.findElement(By.name("PASSWORD"));
			//element.sendKeys("123456");
			//element.submit();
			iewb.findElement(By.xpath("//a[@class='submit button pie_first-child']")).submit();
			}
		
		
		//@AfterClass
		//public void releaseIEDriver(){
			//iewb.quit();
	}
