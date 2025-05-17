package javaass;

public class p3b3 {
	
	    // User-defined function to reverse a string
	    public static String reverseString(String input) {
	        StringBuilder sb = new StringBuilder(input);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String original = "Java Programming";
	        String reversed = reverseString(original);
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversed);
	    }
	}


