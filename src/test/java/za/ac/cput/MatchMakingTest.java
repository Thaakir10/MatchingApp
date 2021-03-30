package za.ac.cput;

/**
 * @author Caleb Ruiters - 215169751
 *
 * Test cases demonstating:
 *
 *  Equality
 *  Identity
 *  Timeouts
 *  Disabling
 *  Failing
 * */

import org.junit.jupiter.api.Disabled;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.*;

class MatchMakingTest {

    private MatchMaking heart, spade, shovel;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        heart = new MatchMaking();
        spade = new MatchMaking();
        shovel = spade;
    }

    @org.junit.jupiter.api.Test
    public void compareEquality() {
        assertEquals(shovel, spade);
    }

    @org.junit.jupiter.api.Test
    public void compareIdentity() {
        assertSame(shovel, spade);
    }

    @org.junit.jupiter.api.Test
    void getId() {
        fail("purposely failed test case");
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 1, unit = NANOSECONDS)
    void setId() {
    }

    @org.junit.jupiter.api.Test
    @Disabled
    void getDesc() {
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Disabled
    void setDesc() {
    }
}