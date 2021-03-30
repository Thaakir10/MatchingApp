package za.ac.cput;

/*
 * @Author: Thokozile Snono
 * Student number: 216032121
 * This is the test class for the Circle class
 */

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

    //will fail because they are not equal
    @Test
    public void testEquality() {
        Assertions.assertEquals(circle1, circle2);
    }

    //will pass because they are identical
    @Test
    public void testIdentity() {
        Assertions.assertSame(circle1, circle3);
    }

    //display all variables on the list
    @Test
    @DisplayName("Display all variables on the list")
    public void getRadius() {
        org.junit.jupiter.api.Assertions.fail("Not implemented");
    }

    //setting the timeout
    @Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = NANOSECONDS)
    public void testWithTimeout(){
        //while(true);
    }

    //it does not pass the test.It skips the test because it is still on progress
    @Test
    @Disabled
    @DisplayName("TDD method should not run")
    public void testDisable(){
            org.junit.jupiter.api.Assertions.fail("This test should be disabled");
    }
}