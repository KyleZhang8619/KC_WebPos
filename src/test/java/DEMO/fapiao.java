package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fapiao {
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
	public void testFapiao(){
		iewb = new InternetExplorerDriver(caps);
		iewb.get("https://qa1-eng.kargotest.com/KargoInvoice/control/main");
		// iewb.findElement(By.cssSelector("a.a_row > img")).click();
		iewb.findElement(By.cssSelector( "img[src='/KargoInvoice/resources/images/jia2.png'][complete='complete']")).click();
		
	//	iewb.findElement(By.xpath(table[@id='table_main'][contains(text(),"jia2"]);
		
	}
	
}
