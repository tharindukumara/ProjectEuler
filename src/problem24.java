import java.util.Vector;


public class problem24 {
	static Vector v = new Vector();
	static int count = 0;
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       permutation("0123456789");
	    	   System.out.println(v.elementAt(999999));
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
	public static void permutation(String s){
		permutation("" , s);
	}
	public static void permutation(String fixd , String ch){
		if(v.size() == 1000000){
			return;
		}
		int n = ch.length();
		if(n==0){
			v.add(fixd);
		}
		for(int i=0;i<n;i++){
			 permutation(fixd+ch.charAt(i) , ch.substring(0,i)+ch.substring(i+1,n));
		}
	}
}
