package sample;

import org.testng.annotations.Test;

public class sample {

	@Test(groups = "Smoke")
	public void sample3 () {
		System.out.println("Hi sample");
	}
	
	@Test
	public void sample1 () {
		System.out.println("Hi sample1");
	}
	
	@Test(groups = "Regression")
	public void sample2 () {
		System.out.println("Hi sample2");
	}
}
