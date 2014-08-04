package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserOperation {
	private WebDriver iewb = null;
	private String projectpath = System.getProperty("user.dir");
    String url = "https://www.baidu.com";
    private ParseProperties data = new ParseProperties(System.getProperty("user.dir")+"\\tool\\data.properties"); 
	private ParseProperties locator = new ParseProperties(System.getProperty("user.dir")+"\\tool\\loc.properties"); 
	
@BeforeClass
	public void startIE(){
		System.setProperty("webdriver.ie.driver", projectpath+"/tool/IEDriverServer.exe"); 
		iewb = new InternetExplorerDriver();
}
@Test
	public void stitchIframe(){    
		iewb.get(url);
		iewb.switchTo().frame(iewb.findElement(By.xpath(locator.getValue(""))));
		
		
	



}
}