package za.ac.cput;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    public void addTest(){
        Numbers test = new Numbers();
        int result = test.addNumbers(4, 6);


        assertEquals(10,result);
        System.out.println("The test passes as these numbers are equal...");
    }

    @Test
    public void stringTest(){
        Numbers test2 = new Numbers();
        String resultString = test2.addNumbers("8", "8");

        assertEquals("84", resultString);

        System.out.println("Test will fail as both strings are not equal to 88");
    }

    @Test
    public void testSame(){
        Numbers same = new Numbers();
        same.number = "8";
        Numbers same1 = same;

        assertSame(same, same1);

        System.out.println("These 2 objects are the same");
    }

    @Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = NANOSECONDS)
    public void testWithTimeout(){
        Numbers multiTest = new Numbers();
        long result = multiTest.MultiPlyNumbers(3,76);
        assertTrue(true);
    }


}