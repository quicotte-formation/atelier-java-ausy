package ausy.atelierjava.test;

import ausy.atelierjava.vehicule.Ferrari;
import ausy.atelierjava.vehicule.Lada;
import ausy.atelierjava.vehicule.Vehicule;
import ausy.atelierjava.vehicule.Velo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class VehiculeTest {

    @Test
    public void veloMarcheArriereKO(){
        Velo v = new Velo();
        v.marcheArriere();
        v.avancer();
        v.afficherPosition();
    }

    @Test
    public void test(){

        ArrayList<Vehicule> vehicules = new ArrayList<>();

        vehicules.add( new Velo() );
        vehicules.add( new Ferrari() );
        vehicules.add( new Lada() );

        for(Vehicule v : vehicules){

            v.marcheAvant();
            v.avancer();
            v.volantGauche();
            v.avancer();
            v.afficherPosition();
        }
    }
}
