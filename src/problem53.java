import java.math.BigInteger;
public class problem53 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       
	       //System.out.println(fact(100));
	       int count=0;
	       for(int i=100;i>=1;i--){
	    	   BigInteger n = fact(i);
	    	   for(int j=i;j>=1;j--){
	    		   BigInteger r = fact(j);
	    		   BigInteger nr = fact(i-j);
	    		   BigInteger nCr = n.divide(r.multiply(nr));
	    		   if(nCr.compareTo(new BigInteger("1000000"))>=0){
	    			   count++;
	    		   }
	    	   }
	       }
	       System.out.println(count);
	     
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	
	public static BigInteger fact(int i){
		BigInteger b = new BigInteger("1");
	       for(;i>0;i--){
	    	   b = b.multiply(new BigInteger(Integer.toString(i)));
	       }
	       return b;
	}
}
