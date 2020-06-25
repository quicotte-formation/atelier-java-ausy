package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

public class Serpent extends Reptile{

    @Override
    public void afficher(Turtle turtle) {
        this.resetTurtle(turtle);
        turtle.right(45);
        turtle.forward(100);
        turtle.left(90);
        turtle.forward(100);
        turtle.right(90);
        turtle.forward(100);
    }
}
