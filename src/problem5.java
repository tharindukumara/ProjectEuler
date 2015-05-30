
public class problem5 {
	public static void main(String args[]){
		int y=2;
		while(true){
			if(divisor(y)){
				break;
			}
			y++;
		}
		System.out.println(y);
	}
	public static boolean divisor(int x){
		for(int i=2;i<=20;i++){
			if(x%i != 0){
				return false;
			}
		}
		return true;
	}
}
