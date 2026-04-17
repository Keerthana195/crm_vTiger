package com.section3.frameworks;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	@Test(priority = 1)
	public void dogWakes() {
		Assert.fail();
		System.out.println("Good morning");
	}
	@Test(priority = 2, dependsOnMethods = {"dogWakes"})
	public void dogEats() {
		System.out.println("Chicken");
	}
	@Test(priority = 3, invocationCount = 2)
	public void dogMakeReels() {
		System.out.println("Dance");
	}
//	@Ignore           
	@Test(priority = 4,enabled = false)
	public void dogSleeps() {
		System.out.println("Good night");
	}
	@Test(priority = -2)
	public void dogBarks() {
		System.out.println("Bow Bow");
	}
	
	
}
