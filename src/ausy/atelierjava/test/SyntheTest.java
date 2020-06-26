package ausy.atelierjava.test;

import ausy.atelierjava.synthe.Synthe;
import org.junit.jupiter.api.Test;

public class SyntheTest {

    @Test
    public void test(){
        Synthe synthe = new Synthe();
        synthe.getBoutonOnOff().appuyer();
        synthe.getBoutonVolume().augmenter();
        synthe.jouerNote();

        synthe.getBoutonOnOff().appuyer();
        synthe.jouerNote();
    }
}
