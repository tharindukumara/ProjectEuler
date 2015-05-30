
public class problem36 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       double sum = 0;
	       int startVal = 1000000;
	       for(;startVal>0;startVal--){
	    	   if(palindrome(Integer.toString(startVal)) && palindrome(Integer.toBinaryString(startVal))){
	    		   sum += startVal;
	    	   }
	       }
	       
	       System.out.println(sum);
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	public static boolean palindrome(String s){
		char ch[] = s.toCharArray();
		String revStr = "";
		for(int i=1;i<=ch.length;i++){
			revStr += ch[ch.length-i];
		}
		if(s.equals(revStr))
			return true;
		return false;
	}
}
