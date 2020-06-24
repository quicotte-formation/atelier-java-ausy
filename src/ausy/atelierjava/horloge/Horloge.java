package ausy.atelierjava.horloge;

public class Horloge {

    private int heures;
    private int minutes;

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
    public void avancerUneMinute(){

        minutes++;
        if( minutes>=60 ){
            minutes=0;
            heures++;
            if( heures>=24 ){
                heures=0;
            }
        }
    }

    public void affiche(){

        System.out.println( heures + ":" + minutes );
    }
}
