package ausy.atelierjava.vehicule;

public class Velo extends Vehicule{

    public Velo() {
        this.pas = 1;
    }

    @Override
    public void avancer() {
        if( this.direction == Direction.ARRIERE ){
            return;
        }

        super.avancer();
    }
}
