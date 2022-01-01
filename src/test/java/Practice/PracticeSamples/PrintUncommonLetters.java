package Practice.PracticeSamples;

public class PrintUncommonLetters {

	public static void removeCommonLetters(String str1, String str2) {
		StringBuilder strOp1 = new StringBuilder();
		StringBuilder strOp2 = new StringBuilder();
		int p=0;
	    for (int j = 0; j < str1.length(); j++) {
	        boolean isMatched = false;
	        for (p = 0; p < str2.length(); p++) {
	            if ( str1.charAt(j) == str2.charAt(p)) {
	                isMatched = true;
	                break;
	            }
	        }
	        if(!isMatched) {
	        	strOp1 = (strOp1.append(str1.charAt(j)));
	        	
	        }
	        
	    }
	    System.out.println(strOp1);
	    
	    for (int j = 0; j < str2.length(); j++) {
	        boolean isMatched = false;
	        for (p = 0; p < str1.length(); p++) {
	            if ( str2.charAt(j) == str1.charAt(p)) {
	                isMatched = true;
	                break;
	            }
	        }
	        if(!isMatched) {
	        	strOp2 = (strOp2.append(str2.charAt(j)));
	        	
	        }
		
	}
	    System.out.println(strOp2);
	}
	public static void main(String[] args) {
		removeCommonLetters("BC","Bangalore");
	}
}
