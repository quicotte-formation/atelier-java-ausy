package ausy.atelierjava.vehicule;

public class Velo extends Vehicule{

    @Override
    public void avancer() {
        switch (this.direction){
            case AVANT:
                this.y ++;
                break;
            case ARRIERE:
                this.y --;
                break;
            case GAUCHE:
                this.x--;
                break;
            case DROITE:
                this.x++;
                break;
            default:
                throw new RuntimeException("Cas non pris en charge");
        }
    }
}
