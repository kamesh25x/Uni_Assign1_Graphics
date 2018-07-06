import java.awt.Color;

import acm.graphics.GArc;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * For your favorite car, write a graphics program that draws the symbol of that
 * car. If that one would be to complicated, pick the symbol for your
 * next-to-favorite car. You will get extra credit, if it happens to be a German
 * car manufacturer.
 *
 * @author Kameswar Malladi
 */
public class CarSymbol extends GraphicsProgram {
    public static final int DIAMETER_OVAL_1 = 180;
    public static final int DIAMETER_OVAL_2 = 120;

    public static final int START_LOC_X = 100;
    public static final int START_LOC_Y = 100;
    public static final int THICKNESS = 10;

    public void run() {

        // your code goes here...

        int START_LOC_X_OVAL_2 = START_LOC_X + (DIAMETER_OVAL_1 - DIAMETER_OVAL_2) / 2;
        int START_LOC_Y_OVAL_2 = START_LOC_Y + (DIAMETER_OVAL_1 - DIAMETER_OVAL_2) / 2;

        GOval oval1 = new GOval(DIAMETER_OVAL_1, DIAMETER_OVAL_1);
        add(oval1, START_LOC_X, START_LOC_Y);
        GOval oval2 = new GOval(DIAMETER_OVAL_2, DIAMETER_OVAL_2);
        add(oval2, START_LOC_X_OVAL_2, START_LOC_Y_OVAL_2);

        oval1.setFilled(true);
        oval1.setFillColor(Color.BLACK);
        oval2.setFilled(true);
        oval2.setFillColor(Color.WHITE);

        GArc arc1 = new GArc(DIAMETER_OVAL_2, DIAMETER_OVAL_2, 90, 90);
        arc1.setFilled(true);
        arc1.setFillColor(Color.BLUE);
        add(arc1, START_LOC_X_OVAL_2, START_LOC_Y_OVAL_2);

        GArc arc2 = new GArc(DIAMETER_OVAL_2, DIAMETER_OVAL_2, -90, 90);
        arc2.setFilled(true);
        arc2.setFillColor(Color.BLUE);
        add(arc2, START_LOC_X_OVAL_2, START_LOC_Y_OVAL_2);
    }
}
