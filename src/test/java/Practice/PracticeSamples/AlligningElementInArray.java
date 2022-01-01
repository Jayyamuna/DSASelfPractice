package Practice.PracticeSamples;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AlligningElementInArray {
//	Given an integer array move all the non zero elements towards left side
//Input	for eg: input {0,1,5,6,0,2,3,0,4}
//	output:{1,5,6,2,3,4,0,0,0}
// Solution 1:
	//Check given array is null; if yes throw an exception
	// Consider first non zero element 
	
	//Time Complexity = O(n)
	// Space Complexity = O(n)
	
	
	public int[] moveZeroToRight(int[] arr) {
		int[] output= new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]!=0) {
				output[index]=arr[i];
				index++;
			}
		}
		return output;
	}
	
// Solution 2: Initialize variable int variable i,j with 0
// iterate from start index until the end 
	//check if arr[i] is not equal to zero
	//		if yes assign arr[i] to temp, arr[j] to arr[i] and then temp to arr[j](Swapping)
	// increment j value by one
	// return arr
	
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public int[] moveZeroToRightA(int[] arr) {
		
		int j=0;
		
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]!=0) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
@Test
	public void testOne() {
		int[] actual = {0,1,5,6,0,2,3,0,4};
		
		Assert.assertArrayEquals(new int[] {1,5,6,2,3,4,0,0,0}, moveZeroToRight(actual));
	}

@Test
public void testTwo() {
	int[] actual = {0,1,5,6,0,2,3,0,4};
	
	Assert.assertArrayEquals(new int[] {1,5,6,2,3,4,0,0,0}, moveZeroToRightA(actual));
}
}
