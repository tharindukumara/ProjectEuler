import java.math.BigInteger;


public class problem56 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       BigInteger b = new BigInteger("99");
	       int bgst =0;
	       for(int i=99;i>50;i--){
	    	   for(int j=99;j>50;j--){
	    		   BigInteger pow = b.pow(j);
	    		   if(digitalSum(pow)>bgst){
	    			   bgst = digitalSum(pow);
	    		   }
	    	   }
	    	   b = b.subtract(new BigInteger("1"));
	       }
	       System.out.println(bgst);
	       
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	public static int digitalSum(BigInteger n){
		String s = n.toString();
		int sum =0;
		for(int i=0;i<s.length();i++){
			sum += s.charAt(i) - 48;
		}
		return sum;
		
		
	}
}
