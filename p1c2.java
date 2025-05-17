package adjjava;
import java.util.LinkedList;
import java.util.Iterator;
public class p1c2 {
	 public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Iterating in reverse order:");

	        Iterator<String> reverseIterator = colors.descendingIterator();

	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	

}
