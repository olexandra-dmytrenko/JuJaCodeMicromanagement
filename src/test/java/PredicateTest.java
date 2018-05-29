import org.testng.annotations.Test;

import java.util.function.Predicate;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PredicateTest {
    @Test
    public void testOwnPredicate() {
        Predicate<Integer> equalTo2 = i -> i == 2;
        assertFalse(equalTo2.test(1));
        assertTrue(equalTo2.test(2));
        assertTrue(equalTo2.and(equalTo2).test(2));
    }

    @Test
    public void testisEqualPredicate() {
        Predicate<Integer> equalTo1 = Predicate.isEqual(1);
        assertFalse(equalTo1.test(2));
        assertTrue(equalTo1.test(1));
    }
}