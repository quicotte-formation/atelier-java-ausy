package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

public class Animal {

    private int posX;
    private int posY;

    public void afficher(Turtle turtle){
        // Par défaut, notre animal est un amibe
        turtle.up();
        turtle.setPosition(posX,posY);
        turtle.setDirection(0);
        turtle.down();

        for(int i=0;i<36;i++){
            turtle.forward(20);
            turtle.left(10);
        }
    }
}
