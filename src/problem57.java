import java.math.BigInteger;
public class problem57 {
	static int count = 0;
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		sequence(1000);
		System.out.println(count);
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static void sequence(long n){
		
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		long x=0;
		while(x<n){
			BigInteger d = a.add(b);
			BigInteger c = d.add(b);
			a = c;
			b = d;
			String numerator = a.toString();
			String denominator = b.toString();
			x++;
			//System.out.println(a+" / "+b);
			if(numerator.length()>denominator.length()){
				//System.out.println(a+" / "+b);
				count++;
			}
		}
		
	}

}
