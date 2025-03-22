package testjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TimeTest {
	@Test(timeout=1000)
	public void testSlowMethod1() throws InterruptedException{
		TimeUnit.MILLISECONDS.sleep(900);
	}
}
