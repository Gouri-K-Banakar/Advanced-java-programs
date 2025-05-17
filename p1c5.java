package adjjava;
import java.util.LinkedList;
import java.util.Collections;
public class p1c5 {
	

	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        System.out.println("Before swap: " + colors);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colors, 0, 2);

	        System.out.println("After swap: " + colors);
	    }
	}


