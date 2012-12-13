package interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumsOfMultiplesOfThree {
	
	Sum sum = new Sum();

	@Test
	public void test_0() {
		assertEquals(sum.multiplesOfThree(0), 0);
	}
	
	@Test
	public void test_1() {
		assertEquals(sum.multiplesOfThree(1), 0);
	}
	
	@Test
	public void test_negative_1() {
		assertEquals(sum.multiplesOfThree(-1), 0);
	}

	@Test
	public void test_3() {
		assertEquals(sum.multiplesOfThree(3), 3);
	}
	
	@Test
	public void test_negative_3() {
		assertEquals(sum.multiplesOfThree(-3), -3);
	}

	@Test
	public void test_6() {
		assertEquals(sum.multiplesOfThree(6), 9);
	}
	
	@Test
	public void test_negative_6() {
		assertEquals(sum.multiplesOfThree(-6), -9);
	}
	
	@Test
	public void test_10() {
		assertEquals(sum.multiplesOfThree(10), 18);
	}
	
	@Test
	public void test_12() {
		assertEquals(sum.multiplesOfThree(12), 30);
	}




}
