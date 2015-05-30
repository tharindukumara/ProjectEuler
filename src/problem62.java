import java.math.BigInteger;
import java.util.Arrays;


public class problem62 {
	public static BigInteger cube(int n){
		BigInteger b = new BigInteger(Integer.toString(n));
		return b.pow(3);
	}
	public static boolean isPerm(BigInteger s,BigInteger c){
		String s1 = s.toString();
		String c1 = c.toString();
		char ch1[] = s1.toCharArray();
		char ch2[] = c1.toCharArray();
		char sortdARR1[] = sortArr(ch1);
		char sortdARR2[] = sortArr(ch2);
		if(Arrays.equals(sortdARR1, sortdARR2))
			return true;
		return false;
	}
	public static char[] sortArr(char ch[]){
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
	public static boolean strLen(BigInteger b, BigInteger b2){
		if(b.toString().length()!=b2.toString().length())
			return true;
		return false;
	}
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		BigInteger cubes[] = new BigInteger[10000];
		for(int i=0;i<cubes.length;i++){
			cubes[i] = cube(i);
		}
		boolean found = false;
		for(int i=0;i<cubes.length;i++){
			BigInteger b1 = cubes[i];
			for(int j=i+1;j<cubes.length;j++){
				BigInteger b2 = cubes[j];
				if(strLen(b1,b2)){
					i++;
					break;
				}
				else{
					if(isPerm(b1,b2)){
						for(int k=j+1;k<cubes.length;k++){
							BigInteger b3 = cubes[k];
							if(strLen(b1,b3)){
								j++;
								break;
							}
							else{
								if(isPerm(b1,b3)){
									for(int l=k+1;l<cubes.length;l++){
										BigInteger b4 = cubes[l];
										if(strLen(b1,b4)){
											k++;
											break;
										}
										else{
											if(isPerm(b1,b4)){
												for(int m=l+1;m<cubes.length;m++){
													BigInteger b5 = cubes[m];
													if(strLen(b1,b5)){
														l++;
														break;
													}
													else{
														if(isPerm(b1,b5)){
															System.out.println(b1);
															found = true;
															break;
														}
													}
												}
											}
											else{
												continue;
											}
										}
									}
									if(found)
										break;
								}
								else{
									continue;
								}
							}
						}
						if(found)
							break;
					}
					else{
						continue;
					}
					
				}		
			}
			if(found)
				break;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
}
