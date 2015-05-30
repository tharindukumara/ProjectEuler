import java.math.*;
public class problem48 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		BigInteger b1 = new BigInteger("1");
		BigInteger b2 = new BigInteger("1");
		BigInteger sum  = new BigInteger("0");
		for(int i =1;i<=1000;i++){
			sum = sum.add(b1.pow(i));
			b1 = b1.add(b2);
			System.out.println(sum);
		}
		System.out.println("==========================================");
		
		String s = sum.toString();
		String s2 = "";
		System.out.println(s);
		for(int i = 1;i<=10;i++){
			s2 += s.charAt(s.length()-i);
		}
		System.out.println(s2);
		String s3="";
		for(int i=9;i>=0;i--){
			s3 += s2.charAt(i);
		}
		System.out.println(s3);
		long end = System.currentTimeMillis();
	
		System.out.println(end-begin+"ms");
	}
}
