package za.ac.cput;

/**@author Shaheed Cloete - 213239442
 *
 * Test cases
 *
 * 29 March 2021
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class NamesTest {

    @Test
    public void getNameEquality() throws Exception{
        Names t3 = new Names("Craven");
        Names t4 = t3;
        assertEquals("Craven", t4.getNameEquality());

    }

    @Test
    public void getNameIdentity(){
        Names t1 = new Names("Shaheed");
        Names t2 = t1;
        assertSame(t1, t2);
    }

    @Test
    @Timeout(5)
    public void getNameTimeout() throws InterruptedException{
        Names t1 = new Names("Chaos");
        Names t2 = new Names("Burt");
        assertEquals("Burt", t2.getNameTimeout());
        assertEquals("Chaos", t1.getNameTimeout());
        Thread.currentThread().sleep(4000);
        System.out.println("Test Passed with in the time");
    }


    @Test
    @Disabled("Test Disabled")
    public void getNameDisabled() {
        Names t1 = new Names("Harbinger");
        Names t2 = new Names("Sam");
        assertEquals("Sam", t2.getNameDisabled());
    }

    @Test
    public void getNameFailing(){
        Names t3 = new Names("Keane");
        Names t4 = new Names("Sam");
        fail("Keane");
    }
}
