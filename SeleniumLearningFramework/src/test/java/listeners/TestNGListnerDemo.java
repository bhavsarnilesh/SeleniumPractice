package listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListnerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("I'm Inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println("I'm Inside test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("I'm Inside test3");
		throw new SkipException("This test case skipped");
	}
	@Test
	public void test4()
	{
		System.out.println("I'm Inside test4");
	}
	
	

}
