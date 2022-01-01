package Practice.PracticeSamples;

public class PallindromeWithSpecialCharacters {
//Given a string confirm if it's a palindrome or not (ignoring special chars)

//Input- "A man, a plan, a canal: Panama"
//Output- true 

//Input- race a car
//Output- false
	//Solution: 
	public void pallindrome(String original) {
		char[] ch = original.toCharArray();
		int i=0;
		int j =ch.length-1;
		if(ch[i]==ch[j]) {
			i++;
			j--;
			
		}
		
	}
}
