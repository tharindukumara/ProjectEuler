public class problem45 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		long a = 286, b = 166, c = 143; 						

		for(;!(a*(a+1)/2 == b*(3*b-1)/2 && b*(3*b-1)/2 == c*(2*c-1));)
		{
			while (a*(a+1)/2 < b*(3*b-1)/2 || a*(a+1)/2 < c*(2*c-1)) 
				a++;
			
			while (b*(3*b-1)/2 < a*(a+1)/2)
				b++;
			
			while (c*(2*c-1) < b*(3*b-1)/2 ) 
				c++;
		}

		System.out.println(a + " " + b + " " +c);  
		System.out.println((a*(a+1)/2));
		long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
	}
}
