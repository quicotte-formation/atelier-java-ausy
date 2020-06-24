package ausy.atelierjava.test;

import ausy.atelierjava.turtle.Turtle;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class TurtleTest {

    /**
     * 1. Dessiner un carré ( avec boucle )
     * 2. Dessiner un cercle ( avec boucle)
     * 3. Dessiner une forme geo à n cotes ( avec un boucle )
     * 4. Dessiner un carré plein ( couleur rouge )
     * 5. Dessiner une maison
     * 6. Dessiner un arbre
     * 7. Dessiner une fleur ( optionnel )
     * 8. Dessiner un histogramme ( barres verticales de 20 à 200 par pas de 20 )
     * ( le tout ds des tests unitaires différents )
     */
    @Test
    public void ex8() {
        Turtle t = new Turtle();

        // Axes
        t.left(90);
        t.forward(300);
        t.home();
        t.forward(300);
        t.home();
        t.penColor(Color.red);

        // Baton rouge ; )
        for(int i=20;i<=200;i+=20){
            for(int j=0;j<2;j++) {
                t.forward(10);
                t.left(90);
                t.forward(i);
                t.left(90);
            }
            t.forward(30);
        }

        while (true) ;
    }
    @Test
    public void ex7(){
        Turtle t = new Turtle();
        t.speed(1);
        t.up();
        t.forward(2);
        t.left(90);
        for(int i=0;i<130;i++){
            if( i%20==0 ){
                t.left(180);
                for(int j=0;j<120;j++){
                    t.dot(Color.red);
                    t.left(3);
                    t.forward(1);
                }
                t.right(180);
            }
            t.dot(Color.BLACK);
            t.left(3);
            t.forward(1);
        }
        while(true);
    }

    @Test
    public void ex6(){

        Turtle t = new Turtle();
        t.left(90);
        t.forward(100);
        t.right(90);
        t.speed(1);
        for(int i = 0;i<360;i++){
            t.left(1);
            t.forward(1);
        }
        while(true);
    }

    @Test
    public void ex5(){
        Turtle t = new Turtle();
        t.right(90);
        t.forward(100);
        t.right(90);
        t.forward(100);
        t.right(90);
        t.forward(100);
        t.right(70);
        t.forward(50);
        t.right(30);
        t.forward(50);
        while (true);
    }

    @Test
    public void ex3(){
        Turtle t = new Turtle();
        int cote = 7;
        for(int i=0;i<cote;i++){
            t.right(360/cote);
            t.forward(360/cote);
        }
        while (true);
    }

    @Test
    public void ex2() {

        Turtle t = new Turtle();
        t.speed(1);
        for(int i = 0;i<360; i++){
            t.setDirection(i);
            t.forward(0.5);
        }
        while (true);
    }

    @Test
    public void ex1() {

        Turtle t = new Turtle();
        for(int i = 0;i<4; i++){
            t.forward(100);
            t.left(90);
        }
        while (true);
    }
}
