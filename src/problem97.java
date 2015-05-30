import java.math.BigInteger;
public class problem97 {
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       BigInteger b2 = new BigInteger("2");
	       BigInteger b = new BigInteger("7830457");
	       BigInteger b3 = b2.modPow(b, new BigInteger("10000000000"));
	       BigInteger b4 = b3.multiply(new BigInteger("28433"));
	       BigInteger b5 = b4.add(new BigInteger("1"));
	       System.out.println(b5.toString().substring(b5.toString().length()-10));
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}

}
