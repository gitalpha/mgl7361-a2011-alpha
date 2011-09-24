package TUnit.assertion;

import org.junit.*;
import static org.junit.Assert.*;

public class TestAssertion {
    @Test public void un_egale_un() {
        Assertion t = new Assertion();
        assertEquals( t.egaux( 1, 1 ), true );
    }
}
