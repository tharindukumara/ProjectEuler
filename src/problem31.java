
public class problem31 {
public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		int count=0;
		for(int o=0;o<=200;o++){
			for(int n=0;n<=100;n++){
				for(int m = 0;m<=40;m++){
					for(int l=0;l<=20;l++){
						for(int k=0;k<=10;k++){
							for(int j=0;j<=4;j++){
								for(int i=0;i<=2;i++){
									int sum = 100*i + 50*j + 20*k + 10*l + 5*m + 2*n + 1*o;
									if(sum==200)
										count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count+1);
		
		
	    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
			
			

	}
	
}
