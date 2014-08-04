package trainings;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class trainingOne {
	@BeforeClass
	public void beforeOne(){
		System.out.println("this is first");
	}
	@Test
	public void testOne(){
		System.out.println("it is time to test");
	}
	@AfterClass
	public void afterOne(){
		System.out.println("this is end");
	}
	
	
}
