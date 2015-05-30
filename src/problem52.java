import java.util.Arrays;


public class problem52 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	  
	       for(int i = 1; i<1000000;i++){
	    	   if(chkSim(i,i*2)){
	    		   if(chkSim(i,i*4)){
	    			   if(chkSim(i,i*6)){
	    				   System.out.println(i+"==="+i*2+"==="+i*4+"=="+i*6);
	    				   break;
	    	    	   }
		    	   }
	    	   }
	       }
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	public static boolean chkSim(int n , int p){
		String s = Integer.toString(n);
		String s2 = Integer.toString(p);
		char ch1[] = s.toCharArray();
		char ch2[] = s2.toCharArray();
		sortedArr(ch1);
		sortedArr(ch2);
		if(Arrays.equals(ch1, ch2)){
			return true;
		}
		return false;
	}
	public static void sortedArr(char[] c){
		int m;

		for(int i=0;i<c.length;i++){
			for(int j = i;j<c.length;j++){
				if(c[i]>c[j]){
					m=c[i];
					c[i]=c[j];
					c[j]=(char)m;
				}
			}
		}
	}
}
