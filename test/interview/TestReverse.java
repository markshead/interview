package interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestReverse {
	
	Reverse reverse = new Reverse();

	@Test
	public void test_palindrome() {
		assertEquals("ababa", reverse.reverse("ababa"));
	}
	
	@Test
	public void test_reverse() {
		assertEquals("reverse", reverse.reverse("esrever"));
	}
	
	@Test
	public void test_house() {
		assertEquals("reverse", reverse.reverse("house"));
	}

	@Test
	public void test_single_letter() {
		assertEquals("a", reverse.reverse("a"));
	}
	

}
