
public class problem50 {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
	    long primes[] = new long[78490];
	    boolean primesBoo[] = new boolean[9500000];
	       int j=0;
	       for(int i=2;j<primes.length;i++){
	    	   if(isPrime(i)){
	    		   primes[j] = i;
	    		  primesBoo[i] = true;
	    		   j++;
	    	   }
	       }
	       
	    //  System.out.println(primes[78489]);
	    //  System.out.println(primesBoo[997]);
	          int max=0;
	       int ans=0;
	       for(int x=0;x<primes.length;x++){
	    	   int count=0;
	    	   int sum=(int) primes[x];
	    	   for(int y=x+1;sum<1000000 && y < primes.length;y++){
	    		   sum += primes[y];
	    		   count++;
	    		  // System.out.println(sum);
	    		   if(primesBoo[sum]==true){
		    		   if(count>max){
		    			   max =count;
		    			   ans = sum;
		    		   }
	    		   }
	    	   }
	       }
	       System.out.println(ans);
	       
	   
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	
	public static boolean isPrime(long n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
