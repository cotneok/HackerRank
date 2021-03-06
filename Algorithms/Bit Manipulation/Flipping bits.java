import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* Created class. Takes a number of unsigned integers from STDIN
 * and flips bits in its binary representation, then outputs them
 * to STDOUT */
public class Solution {
	
    public static void main(String[] args) {
    	
        // Reads input from STDIN 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        // While there are more numbers to convert
	while(size-- > 0) {
			
            long nextLong = sc.nextLong();
            String bitString = Long.toBinaryString(nextLong); // Convert to binary
            String bitAdd = ""; // Reset
            
            // Creates leading zeros for flipping
            if (bitString.length() < 32) {
            	for(int i = 0; i < 32 - bitString.length(); i++) {
            	    bitAdd = bitAdd + '0';
            	}
            	bitString = bitAdd.concat(bitString);
            }
            
            // 3 expressions to flip all bits
            bitString = bitString.replaceAll("0", "X");
            bitString = bitString.replaceAll("1", "0");
            bitString = bitString.replaceAll("X", "1");
          
            // Converts back to decimal
            BigInteger flipped = new BigInteger(bitString, 2);
            
            System.out.println(flipped);
            
	}
		
	sc.close();
   
    }   
}

