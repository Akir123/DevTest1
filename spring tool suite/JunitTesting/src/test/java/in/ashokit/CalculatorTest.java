package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator c = null;
	
	@BeforeAll
	public void init() {
		c = new Calculator();	
	}
	@AfterAll
	public void destroy() {
		c = null;
	}
	@Test
	public void testadd() {
	//Calculator c = new Calculator();
	int actualResult = c.add(5, 5);
	int expectedResult = 10;

	assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testmul() {
		//Calculator c = new Calculator();
		int actualResult1 = c.mul(6,6);
		int expectedResult1 = 36;
	assertEquals(expectedResult1, actualResult1);
	}

}
