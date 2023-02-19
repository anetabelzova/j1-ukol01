package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();


       // Cast 1 - nakresliPrasatko();
        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(150);
        zofka.turnRight(120);
        zofka.move(150);
        zofka.turnRight(120);
        zofka.move(150);

        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(150);
        zofka.turnRight(30);

        zofka.penDown();
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(250);

        //nozickyPrasatka

        zofka.turnLeft(45);
        zofka.move(45);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(45);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(45);
        zofka.penUp();

        zofka.turnRight(180);
        zofka.move(45);
        zofka.turnRight(135);
        zofka.move(250);

        zofka.penDown();
        zofka.turnRight(135);
        zofka.move(45);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(45);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(45);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
