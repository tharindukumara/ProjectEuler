
public class problem3 {
	public static void main(String args[]){
		double in = 600851475143d;
		double y =2;
		double max = 0;
		while(y<=in){
			if(isPrime(y)){
				if(in%y==0){
					System.out.println(y);
				}
			}
			y++;
		}
	}
	public static boolean isPrime(double d){
		for(int i=2;i<d;i++){
			if(d%i==0){
				return false;
			}
		}
		return true;
	}
}
