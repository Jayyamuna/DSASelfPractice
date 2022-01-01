package Practice.PracticeSamples;

import org.junit.Assert;
import org.junit.Test;
//Problem : 121 check the given number is pallindrome or not

//Solution: Get the integer input num ;a
//initalise integer reversednumber variable with 0, and remainder;
// use entry while loop and check num is not equal to 0
//perform modulo operation and save the remainder
//add reversednumber*10 with remainder and assign it to reversednumber
// divide num by 10 and store it in num variable 
//display reveresednumber
//Time Complexity : (O)n
//space Complexity: (O)n
public class NumberReverse {
	public int reverseNumber(int num) {
		int remainder, reversednumber=0;
		while(num!=0) {
			remainder = num%10;
			reversednumber=reversednumber*10+remainder;
			num=num/10;	
		}
		if(num<0) {
			return reversednumber*-1;
		}
		return reversednumber;
	}
	
	@Test
	public void reverseNumberTest() {
		
		Assert.assertEquals(121,reverseNumber(121));
		
	}
	
	@Test
	public void reverseNumberTestOne() {
		
		Assert.assertEquals(221,reverseNumber(122));
		
	}
	@Test
	public void reverseNumberTestTwo() {
		
		Assert.assertEquals(21,reverseNumber(120));
		
	}
	@Test
	public void reverseNumberTestThree() {
		
		Assert.assertEquals(-99,reverseNumber(-99));
		
	}
}
