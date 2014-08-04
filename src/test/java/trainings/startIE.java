package trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class startIE {
	String userName = "000519"; //用户名
	String passWord = "123456"; //密码
	private WebDriver iewb = null;
	private DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");
	@BeforeClass
	public void launchIE(){
		System.setProperty("webdriver.ie.driver", projectpath+"/tool/IEDriverServer.exe");
	    caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, false);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);   
		caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");		
		caps.setCapability("ignoreZoomSetting", true);
		iewb = new InternetExplorerDriver(caps);
	} 
	@Test
	public void searchOngoogle() {
		iewb.get("https://qa1-eng.kargotest.com/webpos/control/checkLogin?merchant=00062000000");
		iewb.findElement(By.id("username")).sendKeys(userName);
		iewb.findElement(By.id("password")).sendKeys(passWord);
		iewb.findElement(By.cssSelector("body")).click();
		iewb.findElement(By.linkText("登录")).click();
		iewb.findElement(By.id("btn_prepaid")).click();
		iewb.findElement(By.linkText("Type card number")).click();
		iewb.findElement(By.name("cardno")).clear();
		iewb.findElement(By.name("cardno")).sendKeys("cardNo");
		iewb.findElement(By.id("submit_checkcardno")).click();
		iewb.findElement(By.id("newcardsale")).click();
	}
	
	
}
