
public class problem71 {
	public static void main(String args[]){
		farey(8);
	}
	public static void farey(int n){
		int a=1 , b=3, c=1 , d=1;
		while(b+d<=n){
			b = (1 + a*d)/c;
			System.out.print(a+"/"+b+"  ");
		}
	}
}
