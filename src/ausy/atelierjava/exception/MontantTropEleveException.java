package ausy.atelierjava.exception;

public class MontantTropEleveException extends Exception{

    @Override
    public String getMessage() {
        return "Montant trop élévé";
    }
}
