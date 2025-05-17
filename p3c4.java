package javaass;
import java.util.Random;

public class p3c4 {
	
	
	    // User-defined function to generate random string of given length
	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random rand = new Random();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(rand.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        int length = 10;
	        String randomStr = generateRandomString(length);
	        System.out.println("Random String of length " + length + ": " + randomStr);
	    }
	}


