package interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestReverse {
	
	Reverse reverse = new Reverse();

	@Test
	public void test_palindrome() {
		assertEquals(reverse.reverse("ababa"), "ababa");
	}
	
	@Test
	public void test_reverse() {
		assertEquals(reverse.reverse("esrever"), "reverse");
	}
	
	@Test
	public void test_house() {
		assertEquals(reverse.reverse("house"), "esuoh");
	}

	@Test
	public void test_single_letter() {
		assertEquals(reverse.reverse("a"), "a");
	}
	

}
