package ausy.atelierjava.test;

import ausy.atelierjava.objets.animaux.*;
import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AnimalTest {

    @Test
    public void test(){
        Turtle t = new Turtle();
        t.speed(0);

        ArrayList<Animal> animaux = new ArrayList<>();// Je peux mettre dedans n'import quel descendant de Animal.
        Animal a;

        a=new Serpent();// A pointe vers une zone mémoire contenant un Oiseau
        a.setPosX(-100);
        a.setPosY(100);
        animaux.add(a);// La zone mémoire, pas a

        a=new Tortue();// A pointe vers nouvelle zone mém avec un Poisson
        a.setPosX(100);
        a.setPosY(100);
        animaux.add(a);// La zone mémoire, pas a

        for (Animal animAct : animaux){
            animAct.afficher(t);
        }

        while (true);
    }
}
