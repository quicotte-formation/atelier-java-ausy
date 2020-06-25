package ausy.atelierjava.horloge;

import ausy.atelierjava.turtle.Turtle;

public class HorlogeAAiguilles {

    private Aiguille aiguilleHeures;
    private Aiguille aiguilleMin;
    private Aiguille aiguilleSec;
    private int posX;
    private int posY;

    public HorlogeAAiguilles(int h, int m, int s, int posX, int posY){

        this.posX = posX;
        this.posY = posY;

        aiguilleHeures = new Aiguille();
        aiguilleMin = new Aiguille();
        aiguilleSec = new Aiguille();

        aiguilleSec.setLongueur(100);
        aiguilleSec.setMax(59);
        aiguilleSec.setValeur(s);

        aiguilleMin.setLongueur(80);
        aiguilleMin.setMax(59);
        aiguilleMin.setValeur(m);

        aiguilleHeures.setLongueur(50);
        aiguilleHeures.setMax(11);
        aiguilleHeures.setValeur(h);
    }

    public void setHeure(int h){
        aiguilleHeures.setValeur(h);
    }

    public void setMinutes(int m){
        aiguilleMin.setValeur(m);
    }

    public void setSecondes(int s){
        aiguilleSec.setValeur(s);
    }

    public void avancerUneSec(){
        aiguilleSec.avancer();
        if( aiguilleSec.getValeur()==0 ){
            aiguilleMin.avancer();
            if( aiguilleMin.getValeur()==0 ){
                aiguilleHeures.avancer();
            }
        }
    }

    private void resetOrigine(Turtle bob){

        bob.up();
        bob.setPosition(posX,posY);
        bob.setDirection(90);
        bob.down();
    }

    public void dessine(Turtle t){
        // Cadran

        // Aiguilles
        resetOrigine(t);
        aiguilleHeures.dessine(t);
        resetOrigine(t);
        aiguilleMin.dessine(t);
        resetOrigine(t);
        aiguilleSec.dessine(t);
    }
}
