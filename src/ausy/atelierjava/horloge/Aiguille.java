package ausy.atelierjava.horloge;

import ausy.atelierjava.turtle.Turtle;

public class Aiguille {

    private int valeur;
    private int max=59;
    private int longueur=100;

    private void resetOrigine(Turtle bob){

        bob.up();
        bob.setPosition(0,0);
        bob.setDirection(90);
        bob.down();
    }

    public void dessine(Turtle bob){

        resetOrigine(bob);
        bob.right( valeur % max * 360 / max );
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
