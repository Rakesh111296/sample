package sample;

import org.testng.annotations.Test;

public class Test345 {

	@Test(groups = "Smoke")
	public void test () {
		System.out.println("Hi Test");
	}
	
	@Test
	public void test1 () {
		System.out.println("Hi test1");
	}
	
	@Test(groups = "Regression")
	public void test2 () {
		System.out.println("Hi test2");
	}
}
