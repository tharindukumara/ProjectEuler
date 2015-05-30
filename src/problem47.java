
public class problem47 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       boolean primeArr[] = new boolean[150000];
	       for(int i=0;i<primeArr.length;i++){
	    	   primeArr[i] = false;
	       }
	       int x=0;
	       for(int i=2;x<primeArr.length;i++){
	    	   if(isPrime(i)){
	    		   primeArr[i] = true;
	    		   x = x+ i;
	    	   }
	    	   
	       }   
	      int num=100000;
	      boolean ans [] = new boolean[150000];
	      while(num<150000){
	    	  int divCount=0;
	    	  for(int i=2;i<num;i++){
	    		  if(primeArr[i]==true){
	    			  if(num%i==0){
	    				  divCount++;
	    				  if(divCount==4){
	    					  ans[num] = true;
	    					  break;
	    				  }
	    			  }
	    		  }
	    	  }
	    	  num++;
	      }
	      for(int i=0;i<ans.length;i++){
	    	  if(ans[i] == true && ans[i+1] == true && ans[i+2] == true && ans[i+3] == true ){
	    		  System.out.println(i);
	    	  }
	      }
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
