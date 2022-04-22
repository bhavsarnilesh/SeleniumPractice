package demo;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailDemo {
	@Test
	public void test1() {
		System.out.println("In test 1");
	}
	@Test
	public void test2() {
		System.out.println("In test 2");
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("In test 3");
		int i=1/0;
	}
}
