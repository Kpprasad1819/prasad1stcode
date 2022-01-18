package co.uk.advinia.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TC001 {
	
	@BeforeClass
	public static void report()
	{
		System.out.println("report*************************");
	}
	
	@AfterClass
	public static void reportclose()
	{
	 System.out.println("report close############################");
	}
	
	@Before
	public void browsercode()
	{
		System.out.println("Browser code");
		
	}
	
	@After
	public void browserclose()
	{
		System.out.println("browser close");
	}
	
	
	@Test
	public void prasad()
	{
		System.out.println("prasadddddddddddddd");
	}
	
	@Test
	public void prasad1()
	{
		System.out.println("prasad111111111111");
	}
	
	@Test
	public void prasad2()
	{
		System.out.println("prasad222222222222");
	}
	@Ignore
	@Test
	public void prasad3()
	{
		System.out.println("prasad3333333333333");
	}
	@Test
	public void prasad4()
	{
		System.out.println("prasad444444444444");
	}

}
