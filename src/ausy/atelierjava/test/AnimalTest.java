package ausy.atelierjava.test;

import ausy.atelierjava.objets.animaux.Animal;
import ausy.atelierjava.objets.animaux.Poisson;
import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void test(){
        Turtle t = new Turtle();
        t.speed(0);
        Poisson p = new Poisson();
        p.afficher( t );
        while (true);
    }
}
