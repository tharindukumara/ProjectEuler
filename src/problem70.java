import java.util.Arrays;


public class problem70 {
	static boolean[] primes = new boolean[10000000];
	static double[] totient = new double[10000000];
	public static void main (String args[]){
		long begin = System.currentTimeMillis();
			primesToArr(primes.length);
			//System.out.println(primes[102]);
			totient(totient.length);
			//System.out.println(totient[87109]);
			double min =10000;
			double n = 0;
			for(int i=2;i<totient.length;i++){
				double ratio = i/totient[i];
				if(totient[i] !=0){
					double x = totient[i];
					double cstI = Double.parseDouble(Integer.toString(i));
					String chI = Double.toString(cstI);
					String chX = Double.toString(x);
					char chISorted[] = sortedArr(chI);
					char chXSorted[] = sortedArr(chX);
					if(Arrays.equals(chISorted, chXSorted)){
						if(min>ratio){
							min = ratio;
							n = i;
						}
							
					}
				}
			}
			
			System.out.println(n);
			
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void primesToArr(int n){
		primes[2] = true;
		for(int i=3;i<n;i+=2){
			primes[i] = true;
		}
		for(int i=3;i<=Math.floor(Math.sqrt(n));i+=2){
			if(isPrime(i)){
				for(int j=i*i;j<n;j+=2*i){
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
				totient[i] = totient[i] - 1;
				for(int j = 2*i;j<n;j+=i){
					totient[j] *= 1-1.0/i; 
				}
			}
		}
	}
	public static char[] sortedArr(String s){
		char ch[] = s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			for(int j=i;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
}
