package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

public class Oiseau extends Animal{

    @Override
    public void afficher(Turtle bob) {
        this.resetTurtle(bob);

        bob.setDirection(150);
        bob.forward(50);
        bob.backward(50);
        bob.setDirection(30);
        bob.forward(50);
    }
}
