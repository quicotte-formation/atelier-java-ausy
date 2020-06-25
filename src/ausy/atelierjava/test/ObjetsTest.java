package ausy.atelierjava.test;

import ausy.atelierjava.horloge.Aiguille;
import ausy.atelierjava.horloge.Horloge;
import ausy.atelierjava.horloge.HorlogeAAiguilles;
import ausy.atelierjava.objets.animaux.Animal;
import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

public class ObjetsTest {

    @Test
    public void horlogeAAiguillesOK(){

        Turtle t = new Turtle();
        t.speed(0);
        HorlogeAAiguilles h1 = new HorlogeAAiguilles(7,30,59, -100, 100);
        HorlogeAAiguilles h2 = new HorlogeAAiguilles(8,30,59, 100, 100);
        HorlogeAAiguilles h3 = new HorlogeAAiguilles(7,59,59, -100, -100);
        HorlogeAAiguilles h4 = new HorlogeAAiguilles(7,30,59, 100, -100);
        h1.dessine(t);
        h2.dessine(t);
        h3.dessine(t);
        h4.dessine(t);

        while(true);
    }

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


}
