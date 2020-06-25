package ausy.atelierjava.horloge;

import ausy.atelierjava.turtle.Turtle;

public class Aiguille {

    private int valeur;//=0 ; )
    private int max=59;
    private int longueur=100;

    public void dessine(Turtle bob){

        bob.right( 360/(max+1)*valeur );
        bob.forward(longueur);
    }

    public void avancer(){
        valeur++;
        if( valeur>max ){
            valeur=0;
        }
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        if( valeur>max ){
            throw new RuntimeException("Valeur > Max");
        }
        this.valeur = valeur;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        if( max<valeur ){
            throw new RuntimeException("Max < Valeur");
        }
        this.max = max;
    }
}
