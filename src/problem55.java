import java.math.BigInteger;


public class problem55 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int count=0;
	       BigInteger b = new BigInteger("1");
	       for(int i=1;i<10000;i++){
	    	   BigInteger a = b;
	    	   for(int j=0;j<50;j++){
	    		   
	    		   if(isPalin(a.add(new BigInteger(reverse(a))))){
	    			   //System.out.println((a.add(new BigInteger(reverse(a)))));
	    			   break;
	    		   }
	    		   else{
	    			   a = a.add(new BigInteger(reverse(a)));
	    			   
	    		   }
	    		   if(j==49){
    				   count++;
    			   }
	    		   
	    	   }
	    	   b = b.add(new BigInteger("1"));
	       }
	       System.out.println(count);
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static String reverse(BigInteger s1){
		String s = (s1).toString();
		String rev  = "";
		for(int i=0;i<s.length();i++){
			rev += s.charAt(s.length()-1-i); 
		}
		return (rev);
	}
	public static boolean isPalin(BigInteger s1 ){
		if(s1.equals(new BigInteger(reverse(s1))))
			return true;
		return false;
	}
		
}
