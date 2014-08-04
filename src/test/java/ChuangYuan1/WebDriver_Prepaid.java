package ChuangYuan1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;



public class WebDriver_Prepaid {
	private WebDriver ffwb = null;
//	private FirefoxProfile firefoxprofile = null;
//	private String projectpath = System.getProperty("user.dir");
	
	
/*	@BeforeClass
	public void startFirefox(){
		File firebug = new File(projectpath+"/tool/firebug-1.11.0.xpi");
		File firepath = new File(projectpath+"/tool/firepath-0.9.7-fx.xpi");
		firefoxprofile = new FirefoxProfile();
		try{
			firefoxprofile.addExtension(firebug);//安装firebug，firepath
			firefoxprofile.addExtension(firepath);
			firefoxprofile.setPreference("webdriver.accept.untrusted.certs","ture");     //绕过证书
			firefoxprofile.setPreference("extensions.firebug.currentVersion","1.12.1");
			}catch(IOException e){
				// TODD Auto-generated catch block
                e.printStackTrace();
			}
		System.setProperty("webdriver.firefox.bin","C:/Program Files/Mozilla Firefox/firefox.exe");

	}
	*/	
		@Test
		
		public void searchOnBaidu(){
			ffwb = new FirefoxDriver();
/*		
			Cookie cookie = new Cookie("UUID", "733f906f553d46a2b7d54a4eba5bc22f");
			ffwb.manage().addCookie(cookie);
			Cookie cookie1 = new Cookie("SIG", "764206ef6abcf02295e2d7ecf8841639");
			ffwb.manage().addCookie(cookie);
			ffwb.get("https://qa1-eng.kargotest.com/webpos/control/main;jsessionid=?merchant=18621000021");
			WebElement element = ffwb.findElement(By.id("username"));
			element.sendKeys("000525");
			ffwb.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("123456");
*/		
		//	ffwb = new InternetExplorerDriver(caps);
			ffwb.get("https://qa1-eng.kargotest.com/KargoInvoice/control/main");
			ffwb.findElement(By.cssSelector("a.a_row > img")).click();
			
			
			
		
		}
	/*	@AfterClass
	  public void releaseFFDriver(){
			ffwb.quit();
			
	}*/	
	
	}
	
	
	
	
