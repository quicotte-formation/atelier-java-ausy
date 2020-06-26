package ausy.atelierjava.vehicule;

abstract public class Vehicule {

    public enum Direction{
        AVANT,
        ARRIERE,
        GAUCHE,
        DROITE
    }

    protected Direction direction=Direction.AVANT;
    protected int x=0;
    protected int y=0;
    protected int pas;

    abstract public void avancer();

    public void volantGauche(){
        this.direction = Direction.GAUCHE;
    }

    public void volantDroite(){
        this.direction = Direction.DROITE;
    }

    public void marcheAvant(){
        this.direction = Direction.AVANT;
    }

    public void marcheArriere(){
        this.direction = Direction.ARRIERE;
    }

    public void afficherPosition(){
        System.out.println( this.getClass().getSimpleName() + " " + this.x + "," + this.y );
    }
}
