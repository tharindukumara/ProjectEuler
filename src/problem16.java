import java.math.BigInteger;
public class problem16 {
	public static void main (String args[]){
		BigInteger b1 =  new BigInteger("2");
		BigInteger b2 = b1.pow(1000);
		System.out.println(b2);
		int sum =0;
		String s1 = b2.toString();
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			String s2 = Character.toString(ch);
			sum += Integer.parseInt(s2);
		}
		System.out.println(sum);
	}
}
