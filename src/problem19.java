public class problem19 {
	public static void main(String[] args) {
		double l = 123456789101211314d;
		System.out.println(l+1);
	       long begin = System.currentTimeMillis();
	       int count=0;
	       int y=0;
	       for(int i=1900;i<2001;i++){
	    	   int d =0;
	    	   if(i%100==0 && i%400==0){
	    		   d = 366;
	    	   }
	    	   else if(i%4 == 0 && i%100 !=0){
	    		   d = 366;
	    	   }
	    	   else{
	    		   d = 365;
	    	   }
	    	   for(int j=1;j<=12;j++){
	    		   int z =1;
	    		   if(j==1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12){
	    			   z = 31;
	    		   }
	    		   else if(j==2 && d==366){
	    			   z=29;
	    		   }
	    		   else if(j==2){
	    			   z=28;
	    		   }
	    		   else{
	    			   z = 30;
	    		   }
	    		   while(y<=z){
	    			   y = y+7;
	    		   }
	    		   y = y - z;
	    		   if(y==1 && i>=1901){
	    			   count++;
	    		   }
	    	   }  
	       } 
	       System.out.println(count);
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}

}
