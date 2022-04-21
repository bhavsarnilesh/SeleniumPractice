package demo;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTest"})
public class TestNGGroupsDemo {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("******Test 1 *****");
	}
	@Test(groups = {"sanity","smoke","linux.regression"})
	public void test2() {
		System.out.println("******Test 2 *****");
	}

	@Test(groups = {"sanity", "windows.regression"})
	public void test3() {
		System.out.println("******Test 3 *****");
	}

	@Test
	public void test4() {
		System.out.println("******Test 4 *****");
	}

	

}
