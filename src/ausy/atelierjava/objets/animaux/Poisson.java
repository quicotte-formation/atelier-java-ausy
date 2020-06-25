package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

public class Poisson extends Animal{

    @Override
    public void afficher(Turtle turtle) {
        resetTurtle(turtle);

        turtle.forward(100);
    }
}
