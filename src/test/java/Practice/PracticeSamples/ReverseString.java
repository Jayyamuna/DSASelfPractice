package Practice.PracticeSamples;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {
	
		public static String reverseString(String out) throws NullPointerException{
				
			String stringafterTrim=out.trim();
		
		StringBuilder reversedString = new StringBuilder();
		for(int i=out.length()-1;i>=0;i--) {
		reversedString= reversedString.append(out.charAt(i));
		
	}
		//System.out.println(reversedString.toString());
		
		return reversedString.toString();
	}
		
		
		@Test
		public void reverseStringTest() {
			
			Assert.assertNotEquals("anumay",reverseString("Yamuna"));
			
		}
		@Test
	    public void reverseEmptyString(){
	        Assert.assertEquals("121", reverseString("121"));
	    }
		@Test(expected=RuntimeException.class)
	    public void reverseNullString(){
			
				
	        Assert.assertEquals(null, reverseString(null));
			
			
	    }
		
}
