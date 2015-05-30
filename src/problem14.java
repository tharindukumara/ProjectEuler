
public class problem14 {
	public static void main(String args[]){
		   long begin = System.currentTimeMillis();
		   double maxCount = 0;
		   double count = 0;
		   double i;
		   double startVal=0;
		   for(i = 1000000;i>0;i--){
			   count=0;
			   double j = i;
			   while(j > 1){
				   if(j%2==0){
					   j = j/2;
				   }
				   else{
					   j = 3*j + 1;
				   }
				   count++;
				  
			   }
			   if(maxCount<count){
				   maxCount = count;
				   startVal = i;
			   }
		   }
		   System.out.println(maxCount+"====="+startVal);
		   
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	}
}
