import java.util.Arrays;


public class problem32 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int arr[] = new int[100];
	       int ja=0;
	       int result=0;
	       for(int i=4;i<=200;i++){
	    	   for(int j=2000;j>50;j--){
	    		   result = i*j;
	    		   if(chkPanD(i,j,result)){
	    			   arr[ja++] = result;
	    			   
	    		   }
	    	   }
	       }
	       for(int i=0;i<arr.length;i++){
	    	   for(int j=i+1;j<arr.length;j++){
	    		   if(arr[i]==arr[j]){
	    			   arr[j]=0;
	    		   }
	    	   }
	       }
	       int sum2 =  0;
	       for(int i=0;i<arr.length;i++)
	    	   sum2+= arr[i];
	       System.out.println(sum2);
	       
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	public static boolean chkPanD(int a,int b ,int c){
		String s = Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
		char ch[] = s.toCharArray();
		char chS[] = sortdArr(ch);
		char in[] = {'1','2','3','4','5','6','7','8','9'};
		
		if(Arrays.equals(in, chS))
			return true;
		else
			return false;
	}
	public static char [] sortdArr(char[] ch){
		for(int i=0;i<ch.length;i++){
			char c;
			for(int j=i;j<ch.length;j++){
				if(ch[i]>ch[j]){
					c = ch[i];
					ch[i] = ch[j];
					ch[j] =c;
				}
			}
		}
		return ch;
	}
}
