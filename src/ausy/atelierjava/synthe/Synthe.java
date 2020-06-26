package ausy.atelierjava.synthe;

public class Synthe {

    protected BoutonOnOff boutonOnOff;
    protected BoutonVolume boutonVolume;

    public Synthe() {
        boutonOnOff = new BoutonOnOff();
        boutonVolume = new BoutonVolume();
    }

    public void jouerNote(){
        if( boutonOnOff.isAllume() ){
            System.out.println( "note vol=" +boutonVolume.getVolume() );
        }
    }

    public BoutonOnOff getBoutonOnOff() {
        return boutonOnOff;
    }

    public BoutonVolume getBoutonVolume() {
        return boutonVolume;
    }
}
