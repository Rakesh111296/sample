package sample;

import org.testng.annotations.Test;

public class Test123 {

	
	@Test(groups = "Smoke")
	public void demo () {
		System.out.println("Hi Demo");
	}
	
	@Test
	public void demo1 () {
		System.out.println("Hi Demo1");
	}
	
	@Test(groups = "Regression")
	public void demo2 () {
		System.out.println("Hi Demo2");
	}
}
