
public class problem33 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       double sum = 1;
	       for(double i=10;i<100;i++){
	    	   for(double j=10;j<i;j++){
	    		   double d = j/i;
	    		   char[] dn = Double.toString(i).toCharArray();
	    		   char[] n = Double.toString(j).toCharArray();
	    		   
	    		   double d1 = Double.parseDouble(Character.toString(dn[0]));
	    		   double d2 = Double.parseDouble(Character.toString(dn[1]));
	    		   double n1 = Double.parseDouble(Character.toString(n[0]));
	    		   double n2 = Double.parseDouble(Character.toString(n[1]));
	    		   
	    		   if(n2==d1 || n1==d2){
	    			   if(n2/d1 == d || n1/d2==d){
	    				   sum = sum*d;
	    			   }
	    				   
	    		   }
	    		   
	    		   
	    	   }
	       }
	       
	       System.out.println(sum);
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
}
