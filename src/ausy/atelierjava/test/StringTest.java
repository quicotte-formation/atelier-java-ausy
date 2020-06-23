package ausy.atelierjava.test;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    // Exercices
    // "Titre: Pulp Fiction, Réalisateur: Quentin Tarantino, Acteur principal: Samuel L Jackson, Genre: Policier"
    // Récupérer: le titre, le réalisateur, l'acteur et le genre.
    @Test
    public void regex2(){

        String txt = "Titre: Pulp Fiction, Réalisateur: Quentin Tarantino, Acteur principal: Samuel L Jackson, Genre: Policier";
        String regex = "Titre: ([a-z,A-Z ]{2,}), Réalisateur: ([a-z,A-Z ]{2,}), Acteur principal: ([a-z,A-Z ]{2,}), Genre: ([a-z,A-Z ]{2,})";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(txt);
        m.find();
        System.out.println(m.groupCount());
        System.out.println( m.group(1) );
        System.out.println( m.group(2) );
        System.out.println( m.group(3) );
        System.out.println( m.group(4) );
    }

    @Test
    public void regexPatternsEtMatchers(){

        Pattern p = Pattern.compile("([a-z,A-z]{2,}) ([a-z,A-z]{2,}) ([0-9]{4})");
        Matcher m = p.matcher("Eddie Murphy 1961");
        m.find();
        System.out.println( m.group(3) );
    }

    @Test
    public void regexMatch(){

        String txt = "Eddie Murphy 1961";
        boolean b = txt.matches("[a-z,A-z]{2,} [a-z,A-z]{2,} [0-9]{4}");

        System.out.println(b);
    }

    @Test
    public void test(){
        String txt = "bonjour tout le monde bonjour";
        System.out.println( txt.substring(8, 15) );
    }
}
