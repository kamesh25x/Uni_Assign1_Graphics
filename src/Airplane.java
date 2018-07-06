import java.awt.Color;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Let there be light: Write a GraphicsProgram that turns on the lights in an
 * airplane. The code provided draws an dark airplane, your job is it to turn
 * the lights on, i.e., use yellow GRects to draw the lights. The lights should
 * be centered around the middle of the airplane.
 *
 * @author Kameswar Malladi
 */
public class Airplane extends GraphicsProgram {
    public static final int WIDTH = 650;
    public static final int HEIGHT = 300;
    public static final int NR_OF_LIGHTS = 70;
    public static final int LIGHT_WIDTH = 4;
    public static final int LIGHT_HEIGHT = 10;
    public static final int LIGHT_GAP_HORIZONTAL = 2;
    public static final int LIGHT_GAP_VERTICAL = 22;
    public static final int DELAY = 50;

    public void run() {
        setSize(WIDTH, HEIGHT);

        // draw background image:
        GImage backgroundImage = new GImage("airplane.png");
        add(backgroundImage);

        int START_LOC_X = 80;
        int START_LOC_Y = 95;

        for (int i = 0; i < NR_OF_LIGHTS; i++) {
            GRect rightLight = new GRect(LIGHT_WIDTH, LIGHT_HEIGHT);
            add(rightLight, START_LOC_X, START_LOC_Y);
            rightLight.setFilled(true);
            rightLight.setFillColor(Color.YELLOW);
            pause(DELAY);

            GRect leftLight = new GRect(LIGHT_WIDTH, LIGHT_HEIGHT);
            add(leftLight, START_LOC_X, START_LOC_Y + LIGHT_GAP_VERTICAL);
            leftLight.setFilled(true);
            leftLight.setFillColor(Color.YELLOW);
            pause(DELAY);

            START_LOC_X = START_LOC_X + LIGHT_WIDTH + LIGHT_GAP_HORIZONTAL;

        }

    }

}
