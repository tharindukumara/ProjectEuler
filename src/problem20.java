import java.math.*;
public class problem20 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		BigInteger b1 = new BigInteger("100");
		BigInteger sum = new BigInteger("1");
		for(int i =1; i<=100;i++){
			sum = sum.multiply(b1);
			System.out.println(sum);
			b1 = b1.subtract(new BigInteger("1"));
		}
		String s = sum.toString();
		double sum2=0;
		for(int i = 0; i<s.length();i++){
			sum2+= Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(sum2);
		
		long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
	}
	
	
}
