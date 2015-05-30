
public class problem30 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int sum1=0 , sum2 = 0;
	       for(int i = 2;i<1000000;i++){
	    	   String s = Integer.toString(i);
	    	   sum2 = 0;
	    	   for(int j=0;j<s.length();j++){
	    		   int a =  Integer.parseInt(Character.toString(s.charAt(j)));
	    		   sum2 += a*a*a*a*a;
	    	   }
	    	   if(sum2 == i)
	    		   sum1 += sum2;
	       }
	       System.out.println(sum1);
	       
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
}
