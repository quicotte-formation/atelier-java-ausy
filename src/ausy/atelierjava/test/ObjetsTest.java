package ausy.atelierjava.test;

import ausy.atelierjava.horloge.Horloge;
import ausy.atelierjava.objets.animaux.Animal;
import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

public class ObjetsTest {

    @Test
    public  void horlogeTest(){

        Horloge h1 = new Horloge();
        h1.affiche();
        h1.setHeures(14);
        h1.setMinutes(51);
        h1.affiche();
        h1.avancerUneMinute();
        h1.affiche();
        System.out.println( h1.getHeures() );
    }

    @Test
    public void animalTest(){
        Turtle t = new Turtle();

        t.speed(1);
        Animal a = new Animal();
        Animal a2 = new Animal();
        a.afficher(t);
        a2.afficher(t);
        while (true);


    }
}
