package test;

import com.mycompany.app.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ChallengeTest {

    private Challenge challenge;

    @Before
    public void before() throws Exception {
        challenge = new Challenge();
    }

    @Test
    public void determineOutput_returnsFizz_divisibleBy3() {
        int n = 6;

        String result = challenge.determineOutput(n);
        String expected = "fizz";

        assertEquals(expected, result);
    }

    @Test
    public void determineOutput_returnsBuzz_divisibleBy5() {
        int n = 5;

        String result = challenge.determineOutput(n);
        String expected = "buzz";

        assertEquals(expected, result);
    }

    @Test
    public void determineOutput_returnsFizzBuzz_divisibleBy15() {
        int n = 15;

        String result = challenge.determineOutput(n);
        String expected = "fizzbuzz";

        assertEquals(expected, result);
    }

    @Test
    public void determineOutput_returnsLucky_intContains3() {
        int n = 3;

        String result = challenge.determineOutput(n);
        String expected = "lucky";

        assertEquals(expected, result);
    }

    @Test
    public void determineOutput_returnsIntToString_noConditionMet() {
        int n = 7;

        String result = challenge.determineOutput(n);
        String expected = "7";

        assertEquals(expected, result);
    }

    @Test
    public void intContainsThree_returnsTrue_containsThree() {
        int n = 43;

        boolean result = challenge.intContainsThree(n);

        assertTrue(result);
    }

    @Test
    public void intContainsThree_returnFalse_doesNotContainThree() {
        int n = 44;

        boolean result = challenge.intContainsThree(n);

        assertFalse(result);
    }
}
