package interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalindrome {
	Palindrome palindrome = new Palindrome();
	
	@Test
	public void test_even_number() {
		assertTrue("abba", palindrome.isPalindrome("abba"));
		assertTrue("qetteq", palindrome.isPalindrome("qetteq"));
	}
	
	@Test
	public void test_not_palindrome() {
		assertFalse("mouse", palindrome.isPalindrome("mouse"));
	}
	
	@Test
	public void test_odd_number() {
		assertTrue("abdba", palindrome.isPalindrome("abdba"));
	}
	
	@Test
	public void test_short_palindrome() {
		assertTrue("a", palindrome.isPalindrome("a"));
	}
	
	@Test
	public void test_long_palindrome() {
		String input = "qwertyuiopasdfghjklzxcvbnmmnbvcxzlkjhgfdsapoiuytrewq";
		assertTrue(input, palindrome.isPalindrome(input));
	}
	
	@Test
	public void test_long_not_palindrome() {
		String input = "qwertyuiopasdfghjklzxcvbnXmmnbvcxzlkjhgfdsapoiuytrewq";
		assertFalse(input, palindrome.isPalindrome(input));
	}

}
