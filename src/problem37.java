
public class problem37 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int i =10;
	       int count=0;
	       int sum=0;
	       while(true){
	    	   if(truncatePrimes(i)){
	    		   sum+=i;
	    		   count++;
	    	   }
	    	   if(count==11)
	    		   break;
	    	   i++;
	       }
	       
	       System.out.println(sum);
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
			
			
	
	    }
	public static boolean isPrime(long n){
		if(n==1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static boolean truncatePrimes(long n){
		String s = Long.toString(n);
		String s2="";
		//left to right
		for(int i=0;i<s.length();i++){
			s2 = s.substring(i,s.length());
			long l = Long.parseLong(s2);
			if(!isPrime(l))
				return false;
		
		}
	
		//right to left
		for(int i=0;i<s.length();i++){
			
			s2 = s.substring(0,s.length()-i);
			long l = Long.parseLong(s2);
			if(!isPrime(l))
				return false;
		}
		return true;
	}
	
}
