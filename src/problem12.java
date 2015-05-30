import java.math.BigInteger;
public class problem12 {

	public static void main (String args[]){
		BigInteger b1 = new BigInteger("10000");
		BigInteger b2 = new BigInteger("1");
		long c;
		for(int i=1;;i++){
			b2 = b1.multiply(b1.add(new BigInteger("1"))).divide(new BigInteger("2"));
			c = divisor(b2.longValue());
			if(c>=500){
				break;
			}
			//System.out.println(c+"=========="+b2.longValue());
			b1 = b1.add(new BigInteger("1"));
		}
		System.out.println(c+"=========="+b2.longValue());
		
	}
	public static long divisor(long a){
		long count =1;
		for(int i=2;i<=Math.sqrt(a);i++){
			if(a%i == 0){
				count++;
			}
		}
		return 2*count;
	}
}
