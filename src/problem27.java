public class problem27 {
	static boolean primes[] = new boolean[1000000];
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		primes(primes.length);
		int max =0;
		int valOfA = 0;
		int valOfB = 0;
		for(int a=1000;a>-1000;a--){
			for(int b=1000;b>-1000;b--){
				int n=0;
				int count =0;
				int formula = n*n + n*a +b;
				if(formula<0)
					break;
				while(formula > 0 && primes[formula] ){
					formula = n*n + n*a +b;
					n++;
					count++;
				}
				if(count>max){
					max = count;
					valOfA = a;
					valOfB = b;
				}
			}
		}
		System.out.println("a = "+valOfA);
		System.out.println("b = "+valOfB);
		System.out.println("Consecutive Primes = "+max);
		int answr = valOfA * valOfB;
		System.out.println("a*b = "+answr);
		long end = System.currentTimeMillis();
		System.out.println("\n"+"Execution time = "+(end-begin)+"ms");
	}
	public static boolean isPrime(long n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void primes(int n){
		primes[2] = true;
		for(int i=3;i<n;i+=2){
			primes[i] = true;
		}
		for(int i=3;i<=Math.abs(Math.sqrt(n));i++){
			if(primes[i]){
				for(int j=i*i;j<n;j+=2*i){
					primes[j] = false;
				}
			}
		}
	}
}
