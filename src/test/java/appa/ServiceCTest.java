package appa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceCTest {

	@Test
	public void testNotSure() {
		IServiceC serviceC = new ServiceC();
		String result = serviceC.NotSure(10,"Two");
		assertEquals("Two10", result);

	}

}
