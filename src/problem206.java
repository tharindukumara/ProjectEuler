import java.math.BigInteger;


public class problem206 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       String s = "";
	       BigInteger b1 = new BigInteger("1101000000");
	       BigInteger b2 = new BigInteger("1");
	       while(!(b2.toString()).matches("1\\d2\\d3\\d4\\d5\\d6\\d6\\d7\\d8\\d9\\d0")){
	    	  
	    	   b2 = b1.pow(2);
	    	   b1 = b1.add(new BigInteger("1"));
	    	   System.out.println(b2);
	    	  
	       }
	      
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
}
