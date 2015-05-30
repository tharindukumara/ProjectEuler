import java.math.BigInteger;
import java.util.Arrays;
public class problem40 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       long len=0;
	       String s ="";
	      
	       int i=0;
	       while(s.length()<200000){
	    	   s = s.concat(Integer.toString(i));
	    	   i++;
	       }
	       System.out.println(s.length());
	       String s1 = "";
	       while(s1.length()<200000){
	    	   s1 = s1.concat(Integer.toString(i));
	    	   i++;
	       }
	       System.out.println(s1.length());
	       String s2 = "";
	       while(s2.length()<200000){
	    	   s2 = s2.concat(Integer.toString(i));
	    	   i++;
	       }
	       System.out.println(s1.length());
	       String s3 = "";
	       while(s3.length()<200000){
	    	   s3 = s3.concat(Integer.toString(i));
	    	   i++;
	       }
	       System.out.println(s1.length());
	       String s4 = "";
	       while(s4.length()<200000){
	    	   s4 = s4.concat(Integer.toString(i));
	    	   i++;
	       }
	       System.out.println(s4.length());
	       int ans = (s.charAt(10)-48)*(s.charAt(100)-48)*(s.charAt(1000)-48)*(s.charAt(10000)-48)*(s.charAt(100000)-48)*(s4.charAt(200001)-48);
	       System.out.println(ans);
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	       
	    }

}
