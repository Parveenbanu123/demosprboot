package testjunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class DemoUtilsTest {
	DemoUtils d;
	@BeforeClass
	public static void setUpClass() {
		System.out.println("setupClass() called");
		
	}
	@Before
	public void setUp() {
		System.out.println("setup() called");
		d=new DemoUtils();
	}
	@Test
	public void testAdd() {
		System.out.println("Add()");
		assertEquals(4,d.add(2, 2));
	}
	@Test
	public void testAddition() {
		System.out.println("Addition()");
		assertEquals(4,d.addition(1,1, 2));
	}
	@Test
	public void testMultiply() {
		System.out.println("Multiply()");
		assertEquals(100,d.multiply(10, 10));
	}
	@Test
	public void testisEven() {
		System.out.println("isEven()");
		assertTrue("Enter a even number",d.isEven(52));
		//assertFalse(d.isEven(59));
	}
	@Test
	public void testGetMessage() {
		System.out.println("getMessage()");
		assertNull(d.getMessage());
	}
	@Test
	public void testGetNumbers() {
		System.out.println("getNumbers()");
		int[] myarr= {1,2,3,4};
		assertArrayEquals(myarr,d.getNumbers());
	}
	@Test(expected=RuntimeException.class)
	public void testThrowException() {
		System.out.println("throwException()");
		d.throwException();
	}
//	@Test
//	public void testThrowExceptionn() {
//		//assertEquals(1,d.throwException());
//		System.out.println("throwException()");
//		thrown.expect(RuntimeException.class);
//		thrown.expectMessage("RTE happened");
//        throw new RuntimeException("RunTimeException");
//	}
	
	@After
	public void tearDown() {
		System.out.println("teardown() called");
		d=null;
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("teardownClass() called");
		
	}
}
