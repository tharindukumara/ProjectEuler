
public class problem28 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       long sum=0;
	       long i=1;
	       long m=1;
	       while(true){
	    	   for(int j=0;j<4;j++){
	    		   i=i+2*m;
	    		   sum+=i;
	    		   
	    		   
	    	   }
	    	   if(i>=1001*1001)
	    			   break;
	    
	    	   m++;
	       }
	       
	      System.out.println(sum+1);
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin + "ms");
			
	    }
}
