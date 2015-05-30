import java.math.*;
public class problem25 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		BigInteger b1 = new BigInteger("1");
		BigInteger b2= new BigInteger("1");
		for(int i = 3;;i++){
			BigInteger b3 = b1.add(b2);
			b1=b2;
			b2=b3;
			System.out.println(i+"----------"+b3);
			if(b3.toString().length()==1000)
				break;
		}
		System.out.println("---------------------------");
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");

	}
}
