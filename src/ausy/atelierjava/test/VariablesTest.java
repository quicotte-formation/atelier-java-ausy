package ausy.atelierjava.test;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class VariablesTest {

    @Test
    public void testBigIntegerBigDecimal(){

        BigInteger bi1 = new BigInteger("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        BigInteger bi2 = new BigInteger("1");
        System.out.println( bi1.pow(100) );

        BigDecimal bd1 = new BigDecimal("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        BigDecimal bd2 = new BigDecimal("0.0000000000000000000000000000000000000000000000000000000000000001");

        System.out.println( bd1.multiply(bd2) );
    }

    @Test
    public void multiplierString123ParString3VersDoubleEtAfficherResultat(){

        System.out.println( "ce que vous voulez afficher" );
        System.out.println( 12.34 );

        String s = "123";
        String s2 = "3";

        double res = Double.parseDouble(s) * Double.parseDouble(s2);
        System.out.println( res );
    }

    @Test
    public void wrappersTypes(){

        Float f = 10.5f;
        f = null;
        String s = f.toString() + " euros";
        System.out.println( s.toUpperCase() );

        Byte b = 12;
        Short sh = 1234;
        Integer i = 123456;
        Long l = 12345667L;

        Boolean bo = true;// ou false, ou null ; )

        int i2 = Integer.parseInt("1234");
        boolean b3 = Boolean.parseBoolean("true");
    }


    @Test
    public void ajouteFloatEtByte(){
        // créer un float f = 10.5 et un byte b = 5
        // ajouter l'un a l'autre dans la var res double.
        // Sans doute faudra-t-il faire un casting.
        float f = 10.5f;
        byte b = 5;
        double res = f + b;
    }

    @Test
    public void autresTypes(){
        boolean b = true;
        String s = "Hello world";
        char c = 'A';// Obsolète, à éviter.
    }

    @Test
    public void typesDecimaux(){
        float f = (float) 12.34;
        float f2 = 12.34f;
        double d = 12.34;
    }

    @Test
    public void typesEntiers(){
        byte b = 127;// 1 octet
        short s = 1234;// 2 octets
        int i = 123456;// 4 octets
        long l = 12345678;// 8 octets
    }
}