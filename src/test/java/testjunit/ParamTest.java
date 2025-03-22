package testjunit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamTest {
	private int x;
	private int y;
	private int res;
	DemoUtils d;
	public ParamTest(int x, int y, int res) {
		super();
		this.x = x;
		this.y = y;
		this.res = res;
	}
	@Parameters
	public static Collection MyResults() {
		return Arrays.asList(new Object[][]{{5,5,10},{2,3,5},{8,2,10},{1,2,3}});
	}
	@Before
	public void setUp() {
		System.out.println("setup() called");
		d=new DemoUtils();
	}
	@Test
	public void testAddition() {
		System.out.println("Addition()");
		assertEquals(res,d.addition(x,y));
	}
	
	@After
	public void tearDown() {
		System.out.println("teardown() called");
		d=null;
	}
}
