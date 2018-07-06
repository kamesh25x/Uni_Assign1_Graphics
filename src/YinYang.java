import java.awt.Color;

import acm.graphics.GArc;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

/**
 * If you are into esoteric science and philosophy you may have encountered the
 * YinYang symbol. Write a little a graphics program that draws the YinYang
 * symbol. Hint: the GArc class is helpful.
 *
 * @author Kameswar Malladi
 */
public class YinYang extends GraphicsProgram {

    public static final int DIAMETER_OVAL_1 = 180;
    public static final int DIAMETER_OVAL_2 = 90;
    public static final int DIAMETER_OVAL_3 = 20;

    public static final int RIGHT_ANGLE = 90;

    public static final int START_LOC_X = 100;
    public static final int START_LOC_Y = 100;

    public void run() {

        // your code goes here...

        GOval oval1 = new GOval(DIAMETER_OVAL_1, DIAMETER_OVAL_1);
        add(oval1, START_LOC_X, START_LOC_Y);
        oval1.setFilled(true);
        oval1.setFillColor(Color.WHITE);

        GArc arc1 = new GArc(DIAMETER_OVAL_1, DIAMETER_OVAL_1, RIGHT_ANGLE * 3, RIGHT_ANGLE * 2);
        add(arc1, START_LOC_X, START_LOC_Y);
        arc1.setFilled(true);
        arc1.setFillColor(Color.BLACK);

        GArc arc2 = new GArc(DIAMETER_OVAL_2, DIAMETER_OVAL_2, RIGHT_ANGLE * 3, RIGHT_ANGLE * 2);
        add(arc2, START_LOC_X + (DIAMETER_OVAL_1 - DIAMETER_OVAL_2) / 2, START_LOC_Y);
        arc2.setFilled(true);
        arc2.setFillColor(Color.WHITE);
        arc2.setColor(Color.WHITE);

        GArc arc3 = new GArc(DIAMETER_OVAL_2, DIAMETER_OVAL_2, RIGHT_ANGLE, RIGHT_ANGLE * 3);
        add(arc3, START_LOC_X + (DIAMETER_OVAL_1 - DIAMETER_OVAL_2) / 2, START_LOC_Y + (DIAMETER_OVAL_1 - DIAMETER_OVAL_2));
        arc3.setFilled(true);
        arc3.setFillColor(Color.BLACK);

        GOval oval2 = new GOval(DIAMETER_OVAL_3, DIAMETER_OVAL_3);
        add(oval2, START_LOC_X + (DIAMETER_OVAL_1 - DIAMETER_OVAL_3) / 2, START_LOC_Y + (DIAMETER_OVAL_1 - DIAMETER_OVAL_2 - DIAMETER_OVAL_3) / 2);
        oval2.setFilled(true);
        oval2.setFillColor(Color.BLACK);

        GOval oval3 = new GOval(DIAMETER_OVAL_3, DIAMETER_OVAL_3);
        add(oval3, START_LOC_X + (DIAMETER_OVAL_1 - DIAMETER_OVAL_3) / 2, START_LOC_Y + (DIAMETER_OVAL_1 + DIAMETER_OVAL_2 - DIAMETER_OVAL_3) / 2);
        oval3.setFilled(true);
        oval3.setFillColor(Color.WHITE);
    }
}
