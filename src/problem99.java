import java.io.*;


public class problem99 {
	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		String s = "";
		double max=0;
		int base = 0 , exp = 0;
		
		try {
			FileReader f= new FileReader("base_exp.txt");
			BufferedReader bf = new BufferedReader(f);
			
			while((s = bf.readLine())!=null){
				String	arr[] = s.split(",");

				double d = Integer.parseInt(arr[1])*Math.log(Long.parseLong(arr[0]));
				if(max<d){
					max=d;
					base = Integer.parseInt(arr[0]);
					exp = Integer.parseInt(arr[1]);
				}
			}
			int count=0;
			FileReader f1= new FileReader("base_exp.txt");
			BufferedReader bf1 = new BufferedReader(f1);
			String s1 = "";
			while((s1 = bf1.readLine())!=null ){
				count++;
			
				if(s1.equals(Integer.toString(base)+","+Integer.toString(exp))){
					System.out.println(count);
				break;
				}
			
			}
			
			System.out.println(max+"---"+base+"---"+exp);
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		

		
	    long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
			
			

	}

	
}
