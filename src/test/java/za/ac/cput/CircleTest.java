package za.ac.cput;

import org.junit.jupiter.api.*;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle1;
    Circle circle2;
    Circle circle3;

    @BeforeEach
    void setUp() {
        circle1 = new Circle(5);
        circle2 = new Circle(10);
        circle3 = circle1;
    }

    @Test
    void testIdentity() {
        Assertions.assertEquals(circle1, circle2);
    }

//    @Test
//    public void testEquality() {
//        assertEquals(circle1, circle2);
//    }
//
//    @Test
//    void getRadius() {
//        fail("The reason for this is for the program to fail");
//    }
//
//    @Test(timeout = 1000)
//    public void testWithTimeout(){
//        final int factorialOf = 1 + (int) (30000 * Math.random());
//    }
//
//    public void disabledTest()
}