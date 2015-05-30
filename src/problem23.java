import java.math.BigInteger;
import java.util.Vector;
public class problem23{

	public static void main(String[] args) {
		tree tob = new tree();
	       long begin = System.currentTimeMillis();
	       int[] abNum = new int[7000];
	       int a=0;
	       for(int i=1;i<28123;i++){
	    	   if(i<divisors(i)){
	    		   abNum[a] = i;
	    		   a++;
	    	   }
	       }
	       System.out.println(abNum[10]);
	       long sum=0;
	      
	       for(int i=0;i<abNum.length;i++){
	    	   for(int j=i;j<abNum.length;j++){
	    		   if(abNum[i]+abNum[j] <28123)
	    			   tob.insert(Integer.toString(abNum[i]+abNum[j]));
	    	   }
	       }
	       
	      System.out.println(sum);
	      int b=0;
	      long sum2=0;
	      while(b<28123){
	    	  sum2 += b;
	    	  b++;
	      }
	    	  
	      System.out.println(sum2);
	       
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	
	
	public static long divisors(int n){
		long sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0)
				sum += i;
		}
		return sum;
	}

}
class nodee{
	public String element;
	public nodee left;
	public nodee right;
	
	public nodee(){
		element = null;
		left = null;
		right = null;
	}
	public nodee(String s){
		element = s;
		left = null;
		right = null;
	}
	public nodee(String s , nodee l){
		element = s;
		left = l;
		right = null;
	}
	public nodee(String s , nodee l , nodee r){
		element = s;
		left = l;
		right = r;
	}
}
class treee{
	int i=0;
	int j=0;
	long sum=0;
	nodee root;
	nodee cur;
	public treee(){
		root = new nodee();
	}
	public boolean isEmpty(nodee t){
		return t==null;
	}
	public void insert(nodee b , String s){
		if(s.compareTo(b.element)==0){
			
		}
		else if(s.compareTo(b.element)<0){
			if(b.left != null){
				insert(b.left , s);
			}
			else{
				b.left = new nodee(s);
			}
		}
		else if(s.compareTo(b.element)>0){
			if(b.right != null)
				insert(b.right , s);
			else{
				b.right = new nodee(s);
			}
		}
	}
	public void insert(String s){
		if(root.left!=null){
			insert(root.left , s);
		}
		else{
			root.left = new nodee(s);
		}
	}
	public void printInOrder(nodee t){
		if(t.left != null){
			printInOrder(t.left);
		}
		sum += Long.parseLong(t.element);
		if(t.right != null){
			printInOrder(t.right);
		}
	}
	public void printInOrder(){
		printInOrder(root.left);
	}
	
}
   