package Practice.PracticeSamples;

import org.junit.Assert;
import org.junit.Test;

public class StringReverse {

public static String revString(String input) {
	StringBuilder reversedString = new StringBuilder();
	
	for(int i=input.length()-1;i>=0;i--) {
		//if(Character.isAlphabetic(input.charAt(i))
		if(input.charAt(i)>=65 && input.charAt(i)<=90||input.charAt(i)>=97 && input.charAt(i)<=122) {
			reversedString= reversedString.append(input.charAt(i));
			}
	
}
	return reversedString.toString();
}

@Test
public void testString() {
	Assert.assertEquals("amanaPlanacanalpanamA",revString("A man, a plan, a canal: Panama"));
}
@Test
public void testTwo() {
	Assert.assertEquals("anumaY",revString("Yam una"));
}
@Test
public void testThree() {
	Assert.assertEquals("anumaY",revString("Yam una"));
}
}
