package adjjava;
import java.util.ArrayList;
import java.util.Collections;

public class p1b3 {
	
		    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Before sorting: " + colors);

	        // Sorting the colors
	        Collections.sort(colors);

	        System.out.println("After sorting: " + colors);
	    }
	}


