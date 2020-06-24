package ausy.atelierjava.test;

import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

public class TurtleTest {

    @Test
    public void test() {
        Turtle bob = new Turtle();
        for (int i = 0; i < 360; i++) {
            bob.forward(i * 1.25);
            bob.left(90.25);
        }
    }
}
