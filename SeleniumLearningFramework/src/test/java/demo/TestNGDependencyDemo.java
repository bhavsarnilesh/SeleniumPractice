package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	//dependsOnMethods = {"test3", "test2"}
	@Test(priority = 1, dependsOnGroups = "sanity1.*")
	public void test1() { 
		System.out.println("Inside Test 1");
	}
	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("Inside Test 2");
	}

	@Test(groups = {"sanity2"})
	public void test3() {
		System.out.println("Inside Test 3");
	}

}
