import java.math.BigInteger;


public class problem15 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       
	       BigInteger b1 = new BigInteger("40");
	       BigInteger b2 = new BigInteger("1");
	       for(int i=0;i<40;i++){
	    	   b2 = b2.multiply(b1);
	    	   b1 = b1.subtract(new BigInteger("1"));
	       }
	       BigInteger b3 = new BigInteger("20");
	       BigInteger b4 = new BigInteger("1");
	       for(int i=0;i<20;i++){
	    	   b4 = b4.multiply(b3);
	    	   b3 = b3.subtract(new BigInteger("1"));
	       }
	       System.out.println((b2.divide(b4)).divide(b4));
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	
	
}
