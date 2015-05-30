
public class problem76 {
	public static int S[] = new int[99];
	public static void main(String[] args) {
	       long begin = System.currentTimeMillis();
	       int a=0;
	       for(int i=1;i<=99;i++){
	    	   S[a] = i;
	    	   a++;
	       }
	       System.out.println(count(100,S.length));
	       long end = System.currentTimeMillis();
	       System.out.println(end-begin+"ms");
	}
	private static long count(int n, int m)
	{
	if (n < 0)
		{
		return 0;
		}
	else if (n == 0)
		{
		return 1;
		}
	else if (m <= 0 && n >= 1)
		{
		return 0;
		}
	return count(n, m - 1) + count(n - S[m-1], m);
	}

}
