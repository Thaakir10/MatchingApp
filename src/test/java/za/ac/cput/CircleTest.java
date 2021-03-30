package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(20);

        @BeforeEach
        public void setUp () {
            circle1 = new Circle();
            circle2 = new Circle();
            circle3 = new circle1;
        }

        @Test
        public void testIdentity () {

        }
    }
}