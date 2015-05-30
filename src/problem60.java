
public class problem60 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       
	       int primes[] =  new int [1000];
	       int i=2 , j=0;
	       while(i<1000){
	    	   if(isPrime(i)){
	    		   primes[j]=i;
	    		   j++;
	    	   }
	    	   i++;
	       }
	       for(int a=0;a<primes.length;a++){
	    	   	String s = Integer.toString(primes[a]);
	    	   for(int b=0;b<primes.length;b++){
	    		   String s2 = Integer.toString(primes[b]);
	    		   int e = Integer.parseInt(s+s2);
	    		   int f = Integer.parseInt(s2+s);
	    		   if(isPrime(e) && isPrime(f) && e != 0 && f !=0){
	    			   System.out.println(s+"---"+s2+"---"+s+s2+"---"+s2+s);
	    		   }
	    		   
	    	   }
	       }
	       
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
