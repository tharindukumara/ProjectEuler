import java.math.BigInteger;
public class problem85 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		long recNum = 0;
		long f=0;
		long max=0;
		int width = 0;
		int length = 0;
		long minDif = 1000000;
		long dif = 0;
		for(int x=1;x<100;x++){
			for(int y=1;y<100;y++){
				recNum = x * (x + 1) * y * (y + 1) / 4;
				dif = Math.abs(2000000-recNum);
				if(minDif>dif){
					max = recNum;
					minDif = dif;
					width = x;
					length = y;
				}
			}
		}
		System.out.println("Number of squares = "+max);
		System.out.println("length = "+length);
		System.out.println("width = "+width);
		System.out.println("Area = "+(length)*(width));
		
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
}
