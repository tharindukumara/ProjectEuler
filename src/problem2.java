
public class problem2 {
	public static void main(String[] args) {
		double sum = 0;
		double y=1;
		while(fib(y)<=4000000){
			if(fib(y)%2==0){
				sum += fib(y);
			}
			y++;
		}
		System.out.println(sum);
		
	}
	public static double fib(double d){
		if(d==1){
			return 1;
		}
		else if(d==2)
			return 2;
		else
			return fib(d-1)+ fib(d-2);
	}

}
