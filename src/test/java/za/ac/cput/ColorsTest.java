package za.ac.cput;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static java.util.concurrent.TimeUnit.NANOSECONDS;

class ColorsTest {

    private Colors color1, color2, color3;

    @BeforeEach
    public void setUp() {
        color1 = new Colors();
        color2 = new Colors();
        color3 = color2;

    }

    //Testing Object Equality
    @Test
    public void compareEquality() {
        assertEquals(color3, color2);
    }

    //Testing object Identity
    @Test
    public void compareIdentity() {
        assertSame(color3, color2);
    }

    //Testing Failing Test
    @Test
    public void getColors() {
        fail("Intended to fail");
    }

    //Testing Timeout
    @Test
    @org.junit.jupiter.api.Timeout(value = 1, unit = NANOSECONDS)
    public void testTimeouts() {

    }

    //Testing Disabling Test
    @Test
    @Disabled
    public void testDisablingTest() {

    }
}
