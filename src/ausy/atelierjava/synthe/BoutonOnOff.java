package ausy.atelierjava.synthe;

public class BoutonOnOff {

    private boolean allume = false;

    public boolean isAllume() {
        return allume;
    }

    public void appuyer(){
            this.allume = ! allume;
    }
}
