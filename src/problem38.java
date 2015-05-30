import java.util.Arrays;
public class problem38 {
	
	int j=0;
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       
	       //System.out.println(sortedArr("231220074".toCharArray()));
	       //System.out.println(isPandigital("12344678"));
	       long max =0;
	       for(int i=1;i<10000;i++){
	    	   String s = "";
	    	   for(int j=1;j<10;j++){
	    		   long mul = i*j;
	    		   s += Long.toString(mul);
	    		   if(isPandigital(s)){
	    			   if(Long.parseLong(s) > max){
	    				   max = Long.parseLong(s);
	    			   }
	    		   }
	    	   }
	       }
	       System.out.println(max);
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static boolean isPandigital(String s){
		char orderd [] = {'1','2','3','4','5','6','7','8','9'};
		char chk[] = s.toCharArray();
		char ordedChk[] = sortedArr(chk);
		if(Arrays.equals(ordedChk , orderd)){
			return true;
		}
		
		return false;
	}
	public static char[] sortedArr(char ch[]){
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
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
