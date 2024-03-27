package NumberSystem;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
	String str = s.replaceAll("[^a-zA-Z0-9]", "");
    char[] ch= str.toCharArray();
    String nstr=" ";
    for(int i=0;i<ch.length/2;i++){
        char t= ch[i];
        ch[i]= ch[ch.length-1-i];
        ch[ch.length-1-i]=t;
    }
    nstr= new String(ch);
    if(nstr.equalsIgnoreCase(str)){
        return true;
    }
    return false;
}}
