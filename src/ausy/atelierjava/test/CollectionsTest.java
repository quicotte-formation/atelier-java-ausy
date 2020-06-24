package ausy.atelierjava.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsTest {

    /**
     * A partie d'une map de paysCapitales ( 5 éléments à ajouter )
     * on va créer une nouvelle map capitalesPays.
     *
     * Ensuite on affichera la nouvelle map.
     */
    @Test
    public void mapTest2(){
        HashMap<String, String> pc1 = new HashMap<>();
        HashMap<String, String> pc2 = new HashMap<>();

        pc1.put("france","paris");
        pc1.put("italie","rome");
        pc1.put("allemagne","berlin");
        pc1.put("espagne","madrid");
        pc1.put("angleterre","londres");

        for (String pays : pc1.keySet()){

            pc2.put( pc1.get(pays), pays );
        }
    }

    @Test
    public void mapTest(){
        HashMap<String, String> paysCapitales = new HashMap<>();

        paysCapitales.put( "france", "paris" );
        paysCapitales.put( "italie", "rome" );

        System.out.println( paysCapitales.get("italie") );
        System.out.println( paysCapitales.keySet() );
    }

    @Test
    public void setTest(){

        /**
         * Creer un hashset d'entiers pairs de 2 à 10 ( for belge )
         * Ensuite grace à un for américain, itérer sur le set et afficher le carré de chaque élément
         */

        HashSet<Integer> set = new HashSet<>();

        for(int i=2;i<=10;i+=2){
            set.add( i );
        }

        // pour i=elem actuel dans 'set'
        // ici, obligé de faire une form 'américain' parce le HashSet ne gère pas les indices
        for(int i : set){
            System.out.println( Math.pow(i, 2) );
        }
    }

    @Test
    public void listTest2(){

        // Math.random() 0 et 1
        // Dans une liste, vous allez générer 10 entiers aléatoires différents entre 1 et 10.
        ArrayList<Integer> liste = new ArrayList<>();
        do{
            int d = (int) (Math.random() * 10);
            if( ! liste.contains(d) ){
                liste.add(d);
            }
        }while( liste.size()<10 );

        System.out.println( liste );
    }

    @Test
    public void listTest(){

        // Créer une liste de couleurs "blanc, noir, gris, jaune, vert, rouge, bleu"
        // Créer une 2ème liste de couleurs: "blanc, noir, gris, bleu"
        // Supprimer de la 1ère liste les couleurs se trouvant dans la 2ème
        // Ensuite, afficher la liste 1.

        ArrayList<String> liste1 = new ArrayList<>(Arrays.asList( "blanc,noir,gris,jaune,vert,rouge,bleu".split(",") ));
        ArrayList<String> liste2 = new ArrayList<>(Arrays.asList( "blanc,noir,gris,bleu".split(",") ));

        liste1.removeAll(liste2);

        System.out.println( liste1 );
    }
}
