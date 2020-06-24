package ausy.atelierjava.horloge;

import ausy.atelierjava.turtle.Turtle;

public class Horloge {

    private int heures;
    private int minutes;
    private int secondes;

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if( secondes>59 ){
            throw new RuntimeException("Secondes invalides!");
        }
        this.secondes = secondes;
    }

    public int getHeures(){
        return heures;
    }

    public void setHeures(int h){
        if(h>=24 || h<0) {
            throw new RuntimeException("Heure non valide!");
        }

        heures=h;
    }

    public void setMinutes(int min){
        if (minutes>59){
            throw new RuntimeException("Minutes non valides!");
        }

        this.minutes = min;
    }

    /**
     * Avancer l'horlog d'une minute.
     * Si déborde, on incrément heures.
     * Si on débordre heures, on reset.
     */
    public void avancerUneSeconde(){

        secondes++;
        if( secondes>59 ) {
            secondes=0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                heures++;
                if (heures >= 24) {
                    heures = 0;
                }
            }
        }
    }

    public void affiche(){

        System.out.println( heures + ":" + minutes );
    }

    public void dessine(Turtle bob){

        bob.speed(0);
        for(int i = 0;i<360;i++){
            bob.forward(1);
            bob.left(1);
        }

        bob.up();
        bob.left(90);
        bob.forward(60);
        bob.down();

        bob.right( heures * 360 / 12);
        bob.forward(10);
        bob.backward(10);
        bob.left(heures * 360 / 12);

        bob.right( minutes * 360 / 60);
        bob.forward(30);
        bob.backward(30);
        bob.left(minutes * 360 / 60);

        bob.right( secondes * 360 / 60);
        bob.forward(50);
        bob.backward(50);
        bob.left(secondes * 360 / 60);
    }
}
