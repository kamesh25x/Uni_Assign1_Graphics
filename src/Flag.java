import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Write a graphics program that draws the flag of a country you like to visit.
 *
 * @author Kameswar Malladi
 */
public class Flag extends GraphicsProgram {
    public static final int FLAG_WIDTH = 120;
    public static final int FLAG_HEIGHT = 90;

    public void run() {
        // your code goes here...
        GRect rect1 = new GRect(FLAG_WIDTH / 3, FLAG_HEIGHT);
        add(rect1, 50, 50);
        rect1.setFilled(true);
        rect1.setFillColor(Color.GREEN);
        GRect rect2 = new GRect(FLAG_WIDTH / 3, FLAG_HEIGHT);
        add(rect2, 90, 50);
        GRect rect3 = new GRect(FLAG_WIDTH / 3, FLAG_HEIGHT);
        add(rect3, 130, 50);
        rect3.setFilled(true);
        rect3.setFillColor(Color.red);

		/*for(int i=0; i<3; i++){
			GRect rect1a = new GRect(FLAG_WIDTH/3, FLAG_HEIGHT);
			add(rect1a, 50, 200);
			rect1a.setFilled(true);
			rect1a.setFillColor(Color.GREEN);
			GRect rect2a = new GRect(FLAG_WIDTH/3, FLAG_HEIGHT);
			add(rect2a, 90, 200);
			GRect rect3a = new GRect(FLAG_WIDTH/3, FLAG_HEIGHT);
			add(rect3a, 130, 200);
			rect3a.setFilled(true);
			rect3a.setFillColor(Color.red);
		}*/

    }

}
