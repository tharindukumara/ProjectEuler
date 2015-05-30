
public class problem72 {
	static boolean primes[] = new boolean[1000001];
	static double totient[] = new double[1000001];
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		primesToArr(primes.length);
		totient(totient.length);
		long count=0;
		for(int i=1;i<=1000000;i++){
			count += totient[i];
		}
		System.out.println(count-1);
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void primesToArr(int n){
		primes[2] = true;
		for(int i=3;i<n;i+=2){
			primes[i] = true;
		}
		for(int i= 3;i<=Math.floor(Math.sqrt(n));i++){
			if(primes[i]){
				for(int j =i*i;j<n;j+=2*i){
					primes[j] = false;
				}
			}
		}
	}
	public static void totient(int n){
		for(int i=1;i<n;i++){
			totient[i] = i;
		}
		for(int i=2;i<n;i++){
			if(primes[i]){
				totient[i] -= 1;
				for(int j=i*2;j<n;j+=i){
					totient[j] *= 1-1.0/i;
				}
			}
		}
	}
}
