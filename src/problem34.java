
public class problem34 {
	public static void main (String args[]){
		long sum2=0;
		for(int i = 140 ;i<100000; i++){
			String s = Integer.toString(i);
			int sum1=0;
			for(int j = 0;j<s.length();j++){
				sum1 += fact(Long.parseLong(Character.toString(s.charAt(j))));
				
				}
			if(sum1==i){
				sum2+=i;
				System.out.println(i+"================="+sum2);
			}
		}
	}
	public static double fact(double n){
		if (n<=1)
			return 1;
		return n*fact(n-1);
	}
}
