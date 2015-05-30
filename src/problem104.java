import java.math.BigInteger;
import java.util.Arrays;
public class problem104 {
	public static void main(String args[]){
		BigInteger fib1 = new BigInteger("1");
		BigInteger fib2 = new BigInteger("1");
		BigInteger fib3 = new BigInteger("0");
		int i=3;
		BigInteger bArr[] = new BigInteger[25000];
		for(int j=3;j<25000;j++){
			fib3  =  fib1.add(fib2);
			fib1 = fib2;
			fib2 = fib3;
			bArr[j] = fib3;
		}
		for(i=3;i<bArr.length;i++){
			if(bArr[i].toString().length()>18)
			if(isPanD(bArr[i].toString().substring(0,9)) ||
					isPanD(bArr[i].toString().substring(bArr[i].toString().length()-9,bArr[i].toString().length())))
				System.out.println(bArr[i]);
		}
		System.out.println(i);
		//System.out.println(isPanD(fib3.toString().substring(0,9)));
		
		
		
		
	}
	public static char[] sortedArr(char ch[]){
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		return ch;
		
	}
	public static boolean isPanD(String s){
		char chkArr[] = s.toCharArray();
		char ex[] = {'1','2','3','4','5','6','7','8','9'};
		char sortdEle[] = sortedArr(chkArr);
		if(Arrays.equals(ex, sortdEle)){
			return true;
		}
		return false;
	}
}
