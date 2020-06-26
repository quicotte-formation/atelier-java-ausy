package ausy.atelierjava.synthe;

public class BoutonVolume {

    private int volume = 5;

    public int getVolume() {
        return volume;
    }

    public void augmenter(){
        if( volume < 10 ){
            volume++;
        }
    }

    public void diminuer(){
        if( volume > 1 ){
            volume --;
        }
    }
}
