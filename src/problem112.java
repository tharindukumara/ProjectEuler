import java.util.Arrays;
public class problem112 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		double count=0;
		for(int i=100;i<10000000;i++){
			if(isBouncy(i)){
				count++;
			//	System.out.println(i);
			}
			double per = count/i;
			if(per==0.99){
				System.out.print(per+"    ");
				System.out.println(i);
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
	public static boolean isBouncy(long n){
		String s = Long.toString(n);
		String sRev = revStr(s);
		char s1 []= s.toCharArray();
		Arrays.sort(s1);
		if(s.equals(toString(s1)) || sRev.equals(toString(s1))){
			return false;
		}
		return true;
		
	}
	public static String revStr(String s){
		String x = "";
		for(int i=s.length()-1;i>=0;i--){
			x = x.concat(Character.toString(s.charAt(i)));
		}
		return x;
	}
	public static String toString(char ch[]){
		String s = "";
		for(int i=0;i<ch.length;i++)
			s = s.concat(Character.toString(ch[i]));
		return s;
	}
}
