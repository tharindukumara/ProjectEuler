
public class problem10 {
	public static void main(String args[]){
		double sum=0d;
		double x=2d;
		while(x<2000000){
			if(isPrime(x)){
				sum += x;
			}
			x++;
			
		}
		System.out.println(sum);
	}
	public static boolean isPrime(double d){
		for(int i=2;i<=Math.sqrt(d);i++){
			if(d%i==0){
				return false;
			}
		}
		return true;
	}
}
