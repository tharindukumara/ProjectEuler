
public class problem77 {
	static int arrPrimes[] = new int[1000];
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		int p=0;
		for(int i=2;p<arrPrimes.length;i++){
			if(isPrime(i)){
				arrPrimes[p] = i;
				p++;
			}
		}
		for(int i=2;i<100;i++){
			if(ways(i,arrPrimes.length)>=5000){
					System.out.println(i);
					break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static int ways(int n , int m){
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if(n>=0 && m <=0)
			return 0;
		return ways(n,m-1)+ways(n-arrPrimes[m-1],m);
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
