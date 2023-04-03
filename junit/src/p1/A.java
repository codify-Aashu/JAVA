package p1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {
	@Test
	public void test1() {
		System.out.println("from test1");
	}
	@Test
	public void test2() {
		System.out.println("from test2" );
	}
	@Before
	public  void beforeMethod() {
		System.out.println("Before method");
	}
	@After
	public  void afterMethod() {
		System.out.println("Before method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Before class");
	}

}
