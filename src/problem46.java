
public class problem46 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int j=0;
	       long primes[] = new long [10000];
	       for(int i=0;j<primes.length;i++){
	    	   if(isPrime(i)){
	    		   primes[j] = i;
	    		   j++;
	    	   }
	       }
	       long powers[] = new long[100];
	       for(int i=1;i<=100;i++){
	    	   powers[i-1] = i*i;
	       }
	       long num=2;
	       long num1 =0;
	       boolean chk = false;
	       while(num<10000){
	    	   if(!isPrime(num) && num%2 != 0){
	    		   for(int i=0;primes[i]<num;i++){
	    			   for(int x=0;2*powers[x]<num;x++){
	    				  num1 = primes[i] + 2*powers[x];
	    				   if(num==num1){
	    					   chk = false;
	    					   break;
	    				   }else{
	    					   chk = true;
	    				   }
	    				   
	    			   }
	    			   if(num==num1){
    					   break;
    				   }
	    		   }
	    		   if(chk)
	    			   System.out.println(num);
	    		   
	    	   }
	    	   num++;
	       }
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(long n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
