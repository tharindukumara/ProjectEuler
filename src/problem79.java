import java.util.Arrays;
import java.util.*;

public class problem79 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int nums[] = {319,680,180,690,129,620,762,689,762,318,368,710,720,710,629,168,160,689,716,731,736,729,316,729,729,710,769,290,719,680,318,389,162,289,162,718,729,319,790,680,890,362,319,760,316,729,380,319,728,716};
	       String firstDigit[] = new String[nums.length];
	       String  secondDigit[] = new String [nums.length];
	       String  thirdDigit[] = new String [nums.length];
	       for(int i=0;i<nums.length;i++){
	    	   firstDigit[i] = Integer.toString(nums[i]/100);
	    	   secondDigit[i] = Integer.toString((nums[i]%100)/10);
	    	   thirdDigit[i] = Integer.toString(nums[i]%10);
	       }
	       //numbers that Can be 1st one
	       List<String> l1= Arrays.asList(firstDigit);
	       Set<String> s1 = new LinkedHashSet<String>(l1);
	       System.out.println(s1);
	       
	       List<String> l2= Arrays.asList(secondDigit);
	       Set<String> s2 = new LinkedHashSet<String>(l2);
	       System.out.println(s2);
	       
	       List<String> l3= Arrays.asList(thirdDigit);
	       Set<String> s3 = new LinkedHashSet<String>(l3);
	       System.out.println(s3);
	       
	       Iterator<String> it1 = s1.iterator();
	       Set<String> s1s2 = new LinkedHashSet<String>();
	       while(it1.hasNext()){
	    	   String s = it1.next();
	    	   if(s2.contains(s) && !s3.contains(s)){
	    		   s1s2.add(s);
	    	   }
	       }
	       System.out.println(s1s2); 
	       Iterator<String> it2 = s2.iterator();
	       Set<String> s2s3 = new LinkedHashSet<String>();
	       while(it2.hasNext()){
	    	   String s = it2.next();
	    	   if(s3.contains(s) && !s1.contains(s)){
	    		   s2s3.add(s);
	    	   }
	       }
	       Set<String> s1Tmp = s1;
	       Set<String> s2Tmp = s2;
	       Set<String> s3Tmp = s3;
	       System.out.println(s2s3); 
	       s1.removeAll(s2);
	       s1.removeAll(s3);
	       s3.removeAll(s2);
	       s2.removeAll(s1s2);
	       s2.removeAll(s2s3);
	       System.out.println(s2);
	       Set<String> midTmp = s2;
	       s1.addAll(s1s2);
	       Set<String> tmp1 = s1;
	       s1.addAll(s2s3);
	       Set<String> tmp2 = s1;
	       s1.addAll(s3);
	       Set<String> tmp3 = s1;
	       s1 = s1Tmp;
	       s2 = s2Tmp;
	       s3 = s3Tmp;
	       System.out.println(tmp3);
	       
	       for(String x:midTmp){
	    	   System.out.print(x+"====>");
	    	   
	    	   for(int i=0;i<nums.length;i++){
	    		   if(thirdDigit[i].equals(x)){
	    			   if(midTmp.contains(thirdDigit[i]))
	    				   System.out.print(firstDigit[i]+", "+secondDigit[i]+", ");
	    		   }
	    		   else if(secondDigit[i].equals(x))
	    			   if(midTmp.contains(thirdDigit[i]))
	    				   System.out.print(firstDigit[i]+", ");
	    	   }
	    	   System.out.println();
	       }
	       
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static void chkPos(int n){
		if(n==3){
			System.out.println("pos 1 = "+n);
		}
	}
}
