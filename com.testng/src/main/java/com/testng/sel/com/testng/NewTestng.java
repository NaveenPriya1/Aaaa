package com.testng.sel.com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestng {

	@Test
	public void test1() {
		System.out.println("From testng 1");
	}

	@Test
	public void test2() {
		System.out.println("From testng 2");
	}

	@Test
	public void test3() {
		System.out.println("From testng 3");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("BeforeGroups");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("aftereClass");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
}
