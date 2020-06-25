package ausy.atelierjava.objets.animaux;

import ausy.atelierjava.turtle.Turtle;

abstract public class Animal {

    protected int posX;
    protected int posY;

    public void resetTurtle(Turtle turtle){
        turtle.up();
        turtle.setPosition(posX, posY);
        turtle.setDirection(270);
        turtle.down();
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    abstract public void afficher(Turtle turtle);
}
