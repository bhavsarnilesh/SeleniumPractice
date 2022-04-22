package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNGParametersDemo {
	
	@Parameters({"myName"})
	@Test
	public void test(@Optional String myName) {
		System.out.println("Name is : "+myName);
	}

}
