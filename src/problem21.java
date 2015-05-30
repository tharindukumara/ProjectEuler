
public class problem21 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int amicableSum=0;
	 
	    	   for(int j=1;j<10000;j++){
	    		   double a = divSum(j);
	    		   if(j == divSum(a) && j != a){
	    			   amicableSum += j;
	    			   System.out.println(amicableSum);
	    		   }
	    	   }
	    
	       System.out.println("Sum ==>"+amicableSum);
	       
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	public static double divSum(double n){
		double sum = 1;
		for(int i=2 ; i<n;i++){
			if(n%i==0){
				sum += i;
			}
		}
		return sum;
	}
}
