package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

public class Tortue extends Reptile{
    @Override
    public void afficher(Turtle turtle) {

        this.resetTurtle(turtle);
        turtle.left(45);
        turtle.forward(100);
        turtle.right(60);
        turtle.forward(125);
        turtle.right(60);
        turtle.forward(125);
    }
}
