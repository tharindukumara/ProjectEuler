public class problem58 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		int a = 1;
		int m = 1;
		int sideLength=1;
		int allNums =1;
		double primeCount=0;
		double ratio = 0;
		while(a<1000000000){			
			for(int i=0;i<4;i++){
				allNums++;
				a += 2*m;
				if(isPrime(a)){
					primeCount++;
				}
			}
			ratio = primeCount/allNums;
			sideLength += 2;
			m++;
			if(ratio<=0.1){
				break;
			}
			
		}
		System.out.println("Side Length is "+sideLength);
			System.out.println("Ratio is "+ratio);
		
		long end = System.currentTimeMillis();
		System.out.println((end-begin)/1000.0+"s");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return  false;
		}
		return true;
	}
	
}
