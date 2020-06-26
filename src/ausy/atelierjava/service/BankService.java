package ausy.atelierjava.service;

import ausy.atelierjava.exception.MontantNegatifException;
import ausy.atelierjava.exception.MontantTropEleveException;

public class BankService {

    public void transferer(int idEmetteur, int idCible, double montant) throws MontantTropEleveException, MontantNegatifException {

        if( montant>10000 ){
            throw new MontantTropEleveException();
        }

        if( montant<=0 ){
            throw new MontantNegatifException();
        }

        // On ferait le transfert réel en base de données.
    }
}
