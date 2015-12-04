package Models;

import java.awt.Color;
import java.util.ArrayList;

public class MyColor {

	public static ArrayList<Color> colors = new ArrayList<Color>();
	
	public static void init() {
		colors.add(Color.RED);
		colors.add(Color.BLUE);
		colors.add(Color.YELLOW);
	}
	public static void reset() {
		colors.add(Color.RED);
		colors.add(Color.BLUE);
		colors.add(Color.YELLOW);	
	}
	
}
