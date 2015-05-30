import java.util.Arrays;


public class problem49 {
	static boolean primes[] = new boolean [10000];
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       primeGen(primes.length);
	       for(int i=1001;i<10000;i++){
	    	   if(primes[i]){
	    		   for(int j = i+1;j<10000;j++){
	    			   if(primes[j] && chkStr(i,j)){
	    				  // System.out.println(i+" "+j);
	    				   int dif1 = j-i;
	    				   for(int k = j+1;k<10000;k++){
	    					   if(primes[k] && chkStr(i,k) && dif1 == k-j){
	    						   System.out.println(i+""+j+""+k);
	    						   break;
	    					   }
	    				   }
	    				   
	    			   }
	    		   }
	    	   }
	       }
	      // System.out.println(chkStr(1234,3421));
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(int n ){
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void primeGen(int n){
		for(int i=3;i<n;i+=2)
			primes[i] = true;
		for(int i=3;i<=Math.sqrt(n);i+=2){
			if(isPrime(i)){
			for(int j=i*i;j<n;j+=2*i){
				primes[j] = false;
			}
			}
		}
	}
	public static boolean chkStr(int n , int chk){
		String s = Integer.toString(n);
		String s1 = Integer.toString(chk);
		char ch1[] = s.toCharArray();
		char ch2[] = s1.toCharArray();
		char sortdCh1[] = sortdArr(ch1);
		char sortdCh2[] = sortdArr(ch2);
		if(Arrays.equals(sortdCh1, sortdCh2))
			return true;
		return false;
	}
	public static char[] sortdArr(char ch[]){
		for(int i=0;i<ch.length;i++){
			for(int j=i;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
}
