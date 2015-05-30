
public class problem17 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       
	       String singNum[] = {"one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
	       String twoNum[] = {"ten" ,"twenty" , "thirty" , "forty" , "fifty" , "sixty" , "seventy" , "eighty" , "ninety"};
	       String specNum[] = {"eleven" , "twelve" ,"thirteen","fourteen" , "fifteen" , "sixteen" , "seventeen" , "eighteen" , "nineteen" };
	       double sum =0;
	       for(int i=0;i<=9;i++){
	    	   if( i>=1 )
	    		  sum+= ( singNum[i-1] +"Hunderd").length();
	    	   for(int b=0;b<=9;b++){
	    		   if(b>=1 && i==0)
	    			   sum+= (twoNum[b-1]).length();
	    		   else if(b>=1 && i>0)
	    			   sum+= (singNum[i-1]+ "Hundredand"+twoNum[b-1]).length();
	    		   for(int c=0;c<9;c++){
	    	    	   if(b==0 && i==0)
	    	    		   sum+=  (singNum[c]).length();
	    	    	   else if(b==1&& i==0){
	    	    		  sum+= specNum[c].length();
	    	    	   }  
	    	    	   else if(b>=2&& i==0)
	    	    		   sum+= (twoNum[b-1]+singNum[c]).length();
	    	    	   else if(i>=1){
	    	    		   sum+= (singNum[i-1]+"Hundredand").length();
	    	    		   if(b==0 )
	    	    			   sum+= (singNum[c]).length();
		    	    	   else if(b==1)
		    	    		   sum+= (specNum[c]).length();
		    	    	   else if(b>=2)
		    	    		   sum+= (twoNum[b-1]+singNum[c]).length();
	    	    	   }
	    		   } 
		       }
	    	   if(i==9)
	    		   sum+= ("onethousand").length();
	       }
	       System.out.println(sum);
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
}
