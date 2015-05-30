
public class problem69 {
	static boolean primesBool[] = new boolean[1000001];
	static double totient[] = new double[1000001];
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		primesBool[2] = true;
		for(int i=3;i<primesBool.length;i+=2){
			primesBool[i] = true;
		}
		for(int i=3;i<=Math.floor(Math.sqrt(primesBool.length));i+=2){
			if(isPrime(i)){
				for(int j=i*i;j<primesBool.length;j+=2*i){
					primesBool[j] = false;
				}
			}
		}
		computeTotient(totient.length);
		
		double max=0;
		int x=0;
		double ans=0;
		for(int i=2;i<totient.length;i++){
			double val = i/ totient[i];
			if(max<val){
				max = val;
				x = i;
				ans = val;
			}
		}
		System.out.println(max);
		System.out.println(x);
		
		
		//System.out.println(primesBool[9]);
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void computeTotient(int n){
		for(int i=1;i<n;i++){
			totient[i] = i;
		}
		for(int i=2;i<n;i++){
			if(primesBool[i]){
				totient[i] = totient[i]-1;
				for(int j=i*2;j<n;j+=i){
					totient[j] *= 1 - 1.0/i;
				}
			}
		}
		
	}
	
}
