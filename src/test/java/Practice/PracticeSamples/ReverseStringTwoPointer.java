package Practice.PracticeSamples;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
//Input: Yamuna
//Output: anumaY
//Solution: Validate whether the given string is null or empty; if its null or empty return original string
//convert original string to char array
//initialise i with and j with length of the char array -1
//using while loop swap the value at i and j ; if i<j
// after swapping decrement the value of j and increment the value of i
// conver char array to string and dispay
//Time complexity:(O)n/2
//Space Complexity:(0)1 

public class ReverseStringTwoPointer {

	public String stringrev(String original) {
		if(original==null||original.isEmpty()) {
			return original;
		}
		char ch[]= original.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i]=ch[j];
			 ch[j]=temp;
			 i++;
			 j--;
		}
		
		return 	new String(ch);
	}
	
	@Test
	public void reverseStringTest() {
		
		Assert.assertEquals("anumaY",stringrev("Yamuna"));
		
	}
	
	
	@Test
	public void reverseStringTestTwo() {
		
		Assert.assertEquals("anumay",stringrev("Yamuna"));
		
	}
}
