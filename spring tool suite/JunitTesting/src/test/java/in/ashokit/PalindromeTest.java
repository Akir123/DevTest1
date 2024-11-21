package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class PalindromeTest {
	 private final Palindrome palindromeChecker = new Palindrome();

	    @ParameterizedTest
	    @ValueSource(strings = {"madam", "racecar", "ama"})
	    public void testPalindromes(String s) {
	        boolean result = palindromeChecker.PorN(s);
	        assertTrue(result, s + " should be a palindrome");
	    }

}
