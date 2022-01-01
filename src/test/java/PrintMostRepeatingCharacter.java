import org.junit.Assert;
import org.junit.Test;

public class PrintMostRepeatingCharacter {
//input:yamuna
//output: - a(2 times occurred)
//Solution: Create an array with the size of ascii value
//Iterate the array from index position0 till end to sort the string
//Iterate the array from index position 0 till end 
//Check the max variable is less than character count assign character count to max variable
//	assign the character to result variable
//return result
	
	
	//Time Complexity :0(n)
	// Space complexity: 0(1)
static final int ASCII_SIZE=256;
public char repeatingCharacter(String arr) {
	
	int max=-1;
	char result=' ';
	int[] count = new int[ASCII_SIZE];
	for(int i=0;i<arr.length();i++) 
	count[arr.charAt(i)]++;
	
		for(int i=0;i<arr.length();i++) {
			if(max<count[arr.charAt(i)]) {
				max=count[arr.charAt(i)];
				result=arr.charAt(i);
				}
			}
		return result;
			}


@Test
public void testOne()
{
    String a = "YMAUNA";
    //missingNumberInArray(a);
 Assert.assertEquals('A', repeatingCharacter(a));
}

@Test
public void testTwo()
{
	 String a = "yesssS";
Assert.assertEquals('s', repeatingCharacter(a));
}
		}
	

