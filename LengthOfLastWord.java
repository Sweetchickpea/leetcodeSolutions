package NumberSystem;

public class LengthOfLastWord {

	 public int lengthOfLastWord(String s) {
	        String[] a= s.split(" ");
	        String b= a[a.length-1];
	        return b.length();
	    }

	}