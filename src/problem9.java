
public class problem9 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		for(int i=1;i<10000;i++){
			for(int j=1;j<i;j++){
				int a =i*i - j*j;
				int b = 2*i*j;
				int c = i*i + j*j;
				if(a+b+c==1000){
					System.out.println(a+"---"+b+"---"+"---"+a*b*c);
				}
			}
		}

		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
}
