package Practice.PracticeSamples;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SecondLargestNumber {
	//-Input- Integer Array
	//Output- Integer
	//Test data - {0,0,2,1}, {0,0,0,0},{-1,-4,-8,-7}

	//Solution:- check if the given array is null, throw an exception
	//find Firstmax and secondmax betweeen first two numbers
	//iterate the array from index position 2 to last index
	// Check if the array element is greater than first max;
	//		if yes update the second max with first max then first max with the array element
	// if the the array element is greater than second max;
	//		if yes update the second max with array element
	// Return second max
	
	
	
	// Time complexity = O(n)
	// Space complexity = O(1)
	public int test(int[] arr) {
		if(arr==null) 
			throw new RuntimeException("Array is Empty");
		int firstmax=arr[0]>arr[1]?arr[0]:arr[1];// 2
		int secondmax=arr[0]<arr[1]?arr[0]:arr[1];//1
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>firstmax) {
				secondmax=firstmax;
				firstmax=arr[i];
			}
			else if(arr[i]>secondmax) {
				secondmax=arr[i];
			}
		}
		
		return secondmax;
	}
	
	@Test
	public void testOne() {
		int[] actual = {0,0,2,1};
		Assert.assertEquals(1, test(actual));
		System.out.println(Arrays.toString(actual));
	}
	
	@Test
	public void testTwo() {
		int[] actual = {0,0,0,0};
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(0, test(actual));
	}
	
	@Test
	public void testThree() {
		int[] actual = {-1,-4,-8,-7};
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(-4, test(actual));
	}
	
}
