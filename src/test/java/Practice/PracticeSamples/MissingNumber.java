package Practice.PracticeSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber {
	
	//-Input- Integer Array
	//Output- Integer
	//Test data - {0,1,2,4}
	//Solution:check if the given array is null or not, throw an exception
	// Initialise elementOne variable with the array value
	// Initialise elementTwo varibale with 1
	//Iterate array element from index position 1 to last position
	// Update the elementOne with array[i]
	// Update the elementTwo with elementTwo^i
	// display the number as elementOne^elementTwo
	
	
	public int missingNumberInArray(int[] arr) {
		int i;
        int elementOne=arr[0];
        int elementTwo=1;
        for( i=1;i<arr.length;i++)
        	elementOne=elementOne^arr[i];
		    for(i=2;i<=arr.length+1;i++)
		    	elementTwo=elementTwo^i;
		    return (elementOne^elementTwo);
		}

		
		    
		@Test
		    public void testOne()
		    {
		        int[] a = {1, 3, 4, 5, 6 };
		        //missingNumberInArray(a);
		     Assert.assertEquals(2, missingNumberInArray(a));
		    }
		
		@Test
	    public void testTwo()
	    {
	        int[] a = { 1, 2, 4, 5 };
	       Assert.assertEquals(3, missingNumberInArray(a));
	    }
}
