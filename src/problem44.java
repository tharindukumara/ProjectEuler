
public class problem44 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       
	       int pent[] = new int[1000];
	       int pen;
	       for(int i=1;i<=1000;i++){
	    	   pen = i*(3*i-1)/2;
	    	   pent[i-1]= pen;
	    	   
	       }
	       for(int i=0;i<pent.length;i++){
	    	   int pent1 = pent[i];
	    	   for(int j=0;j<pent.length;j++){
	    		  
	    	   }
	       }
	       
	       System.out.println(pent[999]);
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
}
