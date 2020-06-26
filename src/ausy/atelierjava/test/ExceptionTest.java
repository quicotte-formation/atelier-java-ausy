package ausy.atelierjava.test;

import ausy.atelierjava.exception.ExposantNegatifException;
import ausy.atelierjava.exception.MontantNegatifException;
import ausy.atelierjava.exception.MontantTropEleveException;
import ausy.atelierjava.service.BankService;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

    @Test
    public void test(){
        BankService service = new BankService();
        try {
            service.transferer(1,2,500000);
            System.out.println("TRY : SUITE");
        } catch (MontantTropEleveException e) {
            System.out.println( "TROP ELEVE" );
            return;
        } catch (MontantNegatifException e) {
            System.out.println( "NEGATIF" );
        }

        System.out.println("SUITE");
    }

    @Test
    public void exposantNegatifOK() throws ExposantNegatifException{

        int n = 10;
        int p = -1;

        if( p<0 ){
            throw new ExposantNegatifException();
        }
    }

    @Test
    public void throwsOK() throws FileNotFoundException {

        File f = new File("fichier.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    @Test
    public void tryCatchOK(){

        File f = new File("fichier.txt");

        try {

            FileInputStream fis = new FileInputStream(f);
            //
            //
            //
            System.out.println("Fichier ouvert ; )");
        }catch(FileNotFoundException e){
            System.out.println("Votre fichier n'existe pas");
        }

    }
}
