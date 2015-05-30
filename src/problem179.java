
public class problem179 {
	static long divisors[] = new long [10000000];
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		divisor();
		int count=0;
		for(int i=2;i+1<divisors.length;i++){
			if(divisors[i]==divisors[i+1])
				count++;
		}
		System.out.println(count);
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static void divisor(){
		for(int i=2;i<10000000;i++){
			divisors[i] = 2;
		}
		for(int i=2;i<=5000000;i++){
			for(int j=i*2;j<10000000;j+=i){
				divisors[j] += 1;
			}
		}
	}
}
