import java.math.BigDecimal;
public class problem26 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       boolean primes[] = new boolean[1001];
	       for(int i=3;i<primes.length;i++){
	    	   primes[i] = true;
	       }
	       for(int i=2;i<Math.sqrt(primes.length);i++){
	    	   if(isPrime(i)){
	    		   for(int j=i*i;j<primes.length;j+=i*2){
	    			   primes[j] = false;
	    		   }
	    	   }
	       }
	       int max = 0;
	       int denominator = 0;
	       for(int i=0;i<primes.length;i++){
	    	   if(primes[i]==true){
	    	   BigDecimal b1 = new BigDecimal("1");
	    	   BigDecimal b2 = new BigDecimal(Integer.toString(i));
	    	   BigDecimal b3 = b1.divide(b2,4000,5);
	    	   StringBuilder sb = new StringBuilder(b3.toString());
	    		   for(int j=2;j<1000;j++){
	    			   int count = 0;
	    			   for(int l=1;l<1000;l++){
	    				   if(sb.charAt(j)==sb.charAt(j+l) && sb.charAt(j)==sb.charAt(j+l*2)
	    						   && sb.charAt(j)==sb.charAt(j+l*3)){
	    					   count = l;
	    					   break;
	    				   }
	    			   }
	    			   if(max < count){
	    				   max = count;
	    				   denominator = i;
	    			   }
	    		   }
	    	   }
	       }
	       System.out.println(denominator);
	       System.out.println("recurring length = "+max);
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(i%n==0)
				return false;
		}
		return true;
	}
}
