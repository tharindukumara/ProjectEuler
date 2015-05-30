import java.math.BigInteger;
public class problem63 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int count=0;
	       for(int i=1;i<100;i++){
	    	   BigInteger b = new BigInteger(Integer.toString(i));
	    	   for(int j=1;j<100;j++){
	    		   BigInteger b2 = b.pow(j);
	    		   if(b2.toString().length()==j){
	    			   //System.out.println(b2);
	    			   count++;
	    		   }
	    	   }
	       }
	       System.out.println(count);
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
}
