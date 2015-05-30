import java.math.BigInteger;


public class problem65 {
	static BigInteger numerator;
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		convergent(99);
		//System.out.println(numerator);
		int sum = 0;
		for(int i=0;i<numerator.toString().length();i++){
			sum += numerator.toString().charAt(i)-48;
		}
		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");

	}
	public static void convergent(long n){
		BigInteger a = new BigInteger("3");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("8");
		BigInteger d = new BigInteger("3");
		long count = 0;
		BigInteger inc = new BigInteger("4");
		long x=2;
		while(count<n){
			numerator = a;
			BigInteger c1 = c;
			BigInteger d1 = d;
			if((count-2)%3==0){
				c = inc.multiply(c).add(a);
				d = inc.multiply(d).add(b);
				inc = inc.add(new BigInteger("2"));
			}
			else{
				c = a.add(c1);
				d = b.add(d1);
			}
			a = c1;
			b = d1;
			count++;
		}
	}
}
