import java.util.*;

public class problem4 {
	public static void main (String args[]){
		int i; int j;int p;int max = 0;
		for(i = 999;i>=100;i--){
			for(j = 999;j>=100;j-- ){
				p = i*j;
				if(chkPalindrome(p)){
					if(p>max){
						max=p;
					}
				}		
			}
		
		}
		System.out.println(max);
	}
	public static boolean chkPalindrome(int x){
		Stack<Character> stk = new Stack<Character>();
		String in = Integer.toString(x);
		for(int i=0;i<in.length();i++){
			char ch = in.charAt(i);
			stk.push(ch);
		}
		String out = "";
		while(!stk.isEmpty()){
			out += stk.pop();
			
		}
		if(out.equals(in))
			return true;
		
		else
			return false;
	}
}
