
public class problem39 {
	public static void main(String args[]){
		long begin = System.currentTimeMillis();
		int a[] = new int[10000];
		for(int i=1;i<1000;i++){
			for(int j=1;j<i;j++){
				int c = i*i + j*j;
				int d = (int) Math.sqrt(c);
				if(i+j+d<=1000 && d*d== i*i + j*j){
					a[i+j+d]++;
				}
			}
		}
		int b=0;
		int d=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>b){
				b = a[i];
				d =i;
			}
		}
			System.out.println(d+"-------"+b);
		long end = System.currentTimeMillis();
		System.out.println(end-begin+"ms");
	}
}
