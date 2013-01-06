package interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumsOfMultiplesOfThree {
	
	Sum sum = new Sum();

	@Test
	public void test_0() {
		assertEquals(0, sum.multiplesOfThree(0));
	}
	
	@Test
	public void test_1() {
		assertEquals(0, sum.multiplesOfThree(1));
	}
	
	@Test
	public void test_negative_1() {
		assertEquals(0, sum.multiplesOfThree(-1));
	}

	@Test
	public void test_3() {
		assertEquals(3, sum.multiplesOfThree(3));
	}
	
	@Test
	public void test_negative_3() {
		assertEquals(-3, sum.multiplesOfThree(-3));
	}

	@Test
	public void test_6() {
		assertEquals(9, sum.multiplesOfThree(6));
	}
	
	@Test
	public void test_negative_6() {
		assertEquals(-9, sum.multiplesOfThree(-6));
	}
	
	@Test
	public void test_10() {
		assertEquals(18, sum.multiplesOfThree(10));
	}
	
	@Test
	public void test_12() {
		assertEquals(30, sum.multiplesOfThree(12));
	}


}
