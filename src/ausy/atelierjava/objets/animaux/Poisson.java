package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

public class Poisson extends Animal{

    @Override
    public void afficher(Turtle turtle) {
        turtle.up();
        turtle.setPosition(posX,posY);
        turtle.down();

        turtle.forward(100);
    }
}
