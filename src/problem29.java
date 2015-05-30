public class problem29 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       bTree tob = new bTree();
	       for(int a = 2;a<=100;a++){
	    	   for(int b=2;b<=100;b++){
	    		   tob.insert(Math.pow(a , b));
	    	   }
	       }
	       tob.printInOrder();
	       
	       System.out.println("Distinct terms --: "+tob.count);
	       
	       long end = System.currentTimeMillis();
			System.out.println(end-begin + "ms");
	    }
}
class bnode{
	public double element;
	public bnode left;
	public bnode right;
	
	public bnode(){
		element =  0;
		left = null;
		right = null;
	}
	public bnode(double s){
		element = s;
		left = null;
		right = null;
	}
	public bnode(double s , bnode l){
		element = s;
		left = l;
		right = null;
	}
	public bnode(double s , bnode l , bnode r){
		element = s;
		left = l;
		right = r;
	}
}
class bTree{
	int i =0;
	int j=0;
	int count=0;
	bnode root;
	bnode cur;
	public bTree(){
		root = new bnode();
	}
	public boolean isEmpty(bnode t){
		return t==null;
	}
	public void insert(bnode b , double s){
		if(s == b.element){
		}
		else if(s<b.element){
			if(b.left != null){
				insert(b.left , s);
			}
			else{
				b.left = new bnode(s);
			}
		}
		else if(s>b.element){
			if(b.right != null)
				insert(b.right , s);
			else{
				b.right = new bnode(s);
			}
		}
	}
	public void insert(double s){
		if(root.left!=null){
			insert(root.left , s);
		}
		else{
			root.left = new bnode(s);
		}
	}
	public void printInOrder(bnode t){
		if(t.left != null){
			printInOrder(t.left);
		}
		count++;
		if(t.right != null){
			printInOrder(t.right);
		}
	}
	public void printInOrder(){
		printInOrder(root.left);
	}
	
}