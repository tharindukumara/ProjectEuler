import java.util.Vector;
public class problem43 {
	static Vector v = new Vector();
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       long sum=0;
	       permutation("0123456789");
	       for(int i=0;i<v.size();i++){
	    	   String s = (String)v.elementAt(i);
	    	   int a1 =Integer.parseInt(s.substring(1,4));
	    	   int a2 =Integer.parseInt(s.substring(2,5));
	    	   int a3 =Integer.parseInt(s.substring(3,6));
	    	   int a4 =Integer.parseInt(s.substring(4,7));
	    	   int a5 =Integer.parseInt(s.substring(5,8));
	    	   int a6 =Integer.parseInt(s.substring(6,9));
	    	   int a7 = Integer.parseInt(s.substring(7,10));
	    	   if(a1%2==0 && a2%3==0 && a3%5==0 && a4%7==0 && a5%11==0 && a6%13==0 && a7%17==0 ){
	    		   sum += Long.parseLong(s);
	    	   }
	       }
	       System.out.println(sum);
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	public static void permutation(String s){
		permutation("" , s);
	}
	public static void permutation(String fixd , String ch){
		int n = ch.length();
		if(n==0){
			v.add(fixd);
		}
		for(int i=0;i<n;i++){
			 permutation(fixd+ch.charAt(i) , ch.substring(0,i)+ch.substring(i+1,n));
		}
	}
}
