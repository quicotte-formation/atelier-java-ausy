package ausy.atelierjava.test;

import ausy.atelierjava.horloge.Aiguille;
import ausy.atelierjava.horloge.Horloge;
import ausy.atelierjava.objets.animaux.Animal;
import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

public class ObjetsTest {

    @Test
    public void aiguilleOK(){
        Turtle t = new Turtle();

        Aiguille a1 = new Aiguille();
        a1.setMax(99);
        a1.setValeur(50);
        a1.dessine(t);
        while(true);
    }

    @Test
    public  void horlogeTest(){

        Horloge h1 = new Horloge();
        h1.setHeures(2);
        h1.setMinutes(51);
        h1.avancerUneSeconde();
        h1.dessine( new Turtle() );
        while (true);
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
