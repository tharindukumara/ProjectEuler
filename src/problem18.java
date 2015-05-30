
public class problem18 {
public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
			int arr[][]=   {{75},
							{95,64},
							{17,47,82},
							{18,35,87,10},
							{20,04,82,47,65},
							{19,01,23,75,03,34},
							{88,02,77,73,07,63,67},
							{99,65,04,28,06,16,70,92},
							{41,41,26,56,83,40,80,70,33},
							{41,48,72,33,47,32,37,16,94,29},
							{53,71,44,65,25,43,91,52,97,51,14},
							{70,11,33,28,77,73,17,78,39,68,17,57},
							{91,71,52,38,17,14,91,43,58,50,27,29,48},
							{63,66,04,68,89,53,67,30,73,16,69,87,40,31},
							{04,62,98,27,23, 9,70,98,73,93,38,53,60,04,23}};
			
			int i=0,j=0,sum=75;
			while(i+2<=arr.length-1){
				int sum1=0;int sum2=0;
				if(arr[i+1][j]>arr[i+1][j+1]){
					if(arr[i+2][j]<arr[i+2][j+1]){
						sum1 += arr[i+1][j] + arr[i+2][j+1];
					}
					else if(arr[i+2][j]>arr[i+2][j+1]){
						sum1+= arr[i+1][j] + arr[i+2][j];
					}
					
				}
				
					if(arr[i+2][j+1]<arr[i+2][j+2]){
						sum2 += arr[i+1][j+1] + arr[i+2][j+2];
					}
					else if(arr[i+2][j+1]>arr[i+2][j+2]){
						sum2+= arr[i+1][j+1] + arr[i+2][j+1];
					}
					
					
				
				if(sum1>sum2){
					System.out.println(arr[i+1][j]);
					sum += arr[i+1][j];
					i++;
				}else{
					System.out.println(arr[i+1][j+1]);
					sum += arr[i+1][j+1];
					i++;j++;
				}
			}
			if(arr[i+1][j]>arr[i+1][j+1])
				sum+= arr[i+1][j];
			else
				sum+= arr[i+1][j+1];
			System.out.println("===============");
			System.out.println(sum);
			System.out.println(i +"=="+j);
		
	    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
			
			

	}
	
}
