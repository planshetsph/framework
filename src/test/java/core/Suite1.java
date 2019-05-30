package core;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Suite1 {
	
	@Parameters("environment")
	@BeforeClass
	public void setup(String environment) {
		System.out.println("Environment is " + environment);
	}

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(true);
	}
}
