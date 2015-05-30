
public class problem35 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	      int count=0;
	       for(int i=2;i<=1000000;i++){
	    	   if(rotateNPrime(i))
	    		   count++;
	    	   
	       }
			System.out.println(count);
			
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
			
			
	    }
	public static boolean rotateNPrime(int n){
		String s = Integer.toString(n);
		for(int i=0;i<s.length();i++){
		
			s = s.substring(s.length()-1)+s.substring(0,s.length()-1);
			int h = Integer.parseInt(s);
			if(!isPrime(h)){
				return false;
			}
	
		}
		return true;
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
