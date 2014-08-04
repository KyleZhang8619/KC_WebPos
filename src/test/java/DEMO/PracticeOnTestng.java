package DEMO;

import org.testng.annotations.*;


public class PracticeOnTestng {
	@BeforeClass
	public void beforeClass(){
		System.out.print("beforeClass \n");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.print("beforeTest \n");
	}
	@Test
	public void aFastTest(){
		System.out.print("aFastTest \n");
	}
	@Test
	public void bSlowTest(){
		System.out.print("bSlowTest \n");
	}
	@AfterTest
	public void afterTest(){
		System.out.print("afterTest \n");
    }
	@AfterClass
	public void afterClass(){
		System.out.print("afterClass \n");
	}
	
}
