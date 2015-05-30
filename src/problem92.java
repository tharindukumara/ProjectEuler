
public class problem92 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	      int count=0;
	      int j=0;
	      for(int i=10000000;i>=2;i--){
	    	  String s = Integer.toString(i);
    		  while(true){
    			  int sum = 0;
    			  char ch[] = s.toCharArray();
	    		  for(int c=0;c<ch.length;c++){
	    			  sum += ((ch[c]-48)*(ch[c]-48));
	    		  }
	    		  s = Integer.toString(sum);
	    		  if(sum==89){
	    			  count++;
	    			  break;
	    		  }
	    		  else if(sum==1){
	    			  break;
	    		  }
    		  }
	      }
	      
	     System.out.println(count);
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
}
