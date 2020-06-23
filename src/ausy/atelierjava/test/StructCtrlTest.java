package ausy.atelierjava.test;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class StructCtrlTest {

    // Programme pour demain: boucle while et do..while
    // collections avec List, Set, Map
    // expressions régulières

    @Test
    public void multiplicationMatriceParNombre(){
        int[] a = new int[]{1,2,3,4,5};
        int n = 5;
        int[] res = new int[5];// 1xn, 2xn, ..
        for(int i=0;i<a.length;++i){
            res[i] = a[i] * n;
        }

        for(int i : res){
            System.out.println( i );
        }
    }

    @Test
    public void forPuissance(){

        BigInteger n = new BigInteger("2");
        int p = 160;
        BigInteger res = new BigInteger("1");
        for(int i=1;i<=p;i++){

            res = res.multiply(n);
        }

        System.out.println( res );
    }

    @Test
    public void for2(){

        // Afficher table de multiplications par 4 ( de 4 à 40, 4 8 12 16.. 40 )

        for(int i=0;i<=10;i+=1){
            System.out.println( 4*i );
        }
        System.out.println("O U");
        for(int i=4;i<=40;i+=4){
            System.out.println( i );
        }
    }

    @Test
    public void for1(){

        //int[] entiers = new int[]{2,4,6}; ( initialisation dans la déclaration )

        String[] couleurs = new String[5];
        couleurs[0] = "rouge";
        couleurs[1] = "vert";
        couleurs[2] = "jaune";
        couleurs[3] = "bleu";
        couleurs[4] = "violet";

        for(String coulAct : couleurs){
            System.out.println( coulAct );
        }
    }

    @Test
    public void switchTest(){
        String couleur = "autre";

        switch ( couleur ){
            case "rouge":
                System.out.println("Action 1");
                break;
            case "vert":
                System.out.println("Action 2");
                break;
            case "jaune":
                System.out.println("Action 3");
                break;
            default:
                System.out.println("Action par défaut");
                break;
        }
        /**
        if( couleur=="rouge" ){
            System.out.println("Action 1");
        }else if( couleur=="vert" ){
            System.out.println("Action 2");
        }else if( couleur=="jaune"){
            System.out.println("Action 3");
        }
         **/
    }

    @Test
    public void ifElseEx2(){

        // Générer 3 nombres aléat entre 0 et 1
        // Afficher les nombres dans l'ordre croissant (grâce à des conditions)
        double d1 = Math.random();
        double d2 = Math.random();
        double d3 = Math.random();

        String msg = "";
        if (d1<d2 && d1<d3){
            msg = msg + d1;
            if(d2<d3){
                msg += " " + d2 + " " + d3;
            }else{
                msg += " " + d3 + " " + d2;
            }
        }else if(d2<d1 && d2<d3){
            msg += d2;
            if(d1<d3){
                msg += " " + d1 + " " + d3;
            }else{
                msg += " " + d3 + " " + d1;
            }
        }else{
            msg += d3;
            if(d1<d2){
                msg += " " + d1 + " " + d2;
            }else{
                msg += " " + d2 + " " + d1;
            }
        }

        System.out.println( msg );
    }

    @Test
    public void ifElse(){

        // && et  || ou   ! not

        Math.random();// Renvoie un double entre 0 et 1

        /**
         * Ex:
         * Générer grace à Math.randow() un entier entre 1 et 10
         * Si il est pair, afficher pair
         * Si il est divisible par 3; afficher divisible par 3
         * ( ! les 2 cas peuvent être vrais ex 6 )
         * Si aucun des 2 cas, allors afficher ' non divisible par 2 ou 3 '
         */

        double value = Math.random() * 10;
        int n = (int) value;
        String msg = "";

        if( n%2==0 ) {
            msg = "Pair";
        }else{
            msg = "Impair";
        }
        if( n%3==0 ){
            msg = msg + "Div par 3";// msg += "Div par 3"
        }else{
           msg = msg + "Pas divisible par 3";
        }

        System.out.println();
    }
}
