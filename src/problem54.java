import java.io.*;
public class problem54 {
	static int player1=0;
	static int player2=0;
	static String player1Deck[] = new String[5];
	static String player2Deck[] = new String[5];
	public static void main(String args[]){
		try{
			FileReader f = new FileReader("poker.txt");
			BufferedReader b = new BufferedReader(f);
			String s = "";
			while((s =b.readLine())!= null){
				int i=0;
				String cards[] = s.split(" ");
				for(i=0;i<cards.length;i++){
					if(i<5){
						player1Deck[i] = cards[i];
					}
					else
						player2Deck[i-5] = cards[i];
				}
				play(sort(player1Deck),sort(player2Deck));
				
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("player1 wins = "+player1);
		System.out.println("player2 wins = "+player2);
	}
	public static int rank(String arr[]){
		if(royalFlush(arr))
			return 10;
		else if(straightFlush(arr))
			return 9;
		else if(fourOfAKind(arr))
			return 8;
		else if(fullHouse(arr))
			return 7;
		else if(flush(arr))
			return 6;
		else if(straight(arr))
			return 5;
		else if(threeOfAKind(arr))
			return 4;
		else if(twoPairs(arr))
			return 3;
		else if(onePair(arr))
			return 2;
		else 
			return 1;
		
	}
	public static void play(String arr1[],String arr2[]){
		if(rank(arr1)>rank(arr2)){
			player1++;
		}

		else if(rank(arr1)<rank(arr2)){
			player2++;
		}
		else{
		    
			//System.out.println("player1");
			if(rank(arr1)==1){
				int x = highCard(arr1,arr2);
				if(x==1)
					player1++;
				else
					player2++;
			}
				
			else if(rank(arr1)==2){
				String a="" , b="";
				for(int i=arr1.length-1;i>0;i--){
					if(precedence(arr1[i])==precedence(arr1[i-1])){
						a = arr1[i];
						break;
					}
				}
				for(int i=arr2.length-1;i>0;i--){
					if(precedence(arr2[i])==precedence(arr2[i-1])){
						b = arr2[i];
						break;
					}
				}
				if(precedence(a)>precedence(b))
					player1++;
				else if(precedence(a)<precedence(b))
					player2++;
				else{
					int x = highCard(arr1,arr2);
					if(x==1)
						player1++;
					else
						player2++;
				}
			}
			
			else if(rank(arr1)==3){
				String a="" , b="";
				int i1=0 , i2=0;
				for(int i=arr1.length-1;i>0;i--){
					if(precedence(arr1[i])==precedence(arr1[i-1])){
						a = arr1[i];
						i1=i;
						break;
						
					}
				}
				for(int i=arr2.length-1;i>0;i--){
					if(precedence(arr2[i])==precedence(arr2[i-1])){
						b = arr2[i];
						i2 = i;
						break;
					}
				}
				if(precedence(a)>precedence(b))
					player1++;
				else if(precedence(a)<precedence(b))
					player2++;
				else{

					String a1="" , b1="";
					for(int i=i1-3;i>0;i--){
						if(precedence(arr1[i])==precedence(arr1[i-1])){
							a1 = arr1[i];
							break;
						}
					}
					for(int i=i2-3;i>0;i--){
						if(precedence(arr2[i])==precedence(arr2[i-1])){
							b1 = arr2[i];
							break;
						}
					}
					if(precedence(a1)>precedence(b1))
						player1++;
					else if(precedence(a1)<precedence(b1))
						player2++;
					else{
						if(highCard(arr1,arr2)==1)
							player1++;
						else
							player2++;
					}
				}
			}
			else if(rank(arr1)==4){
				String a="" , b="";
				for(int i=arr1.length-1;i>0;i--){
					if(precedence(arr1[i])==precedence(arr1[i-1])){
						a = arr1[i];
						break;
					}
				}
				for(int i=arr2.length-1;i>0;i--){
					if(precedence(arr2[i])==precedence(arr2[i])){
						b = arr2[i];
						break;
					}
				}
				if(precedence(a)>precedence(b))
					player1++;
				else if(precedence(a)<precedence(b))
					player2++;
				else{
					if(highCard(arr1,arr2)==1)
						player1++;
					else
						player2++;
				}
			}
			else if(rank(arr1)==5){
				System.out.println("sss");
				if(arr1[4].charAt(0)>arr2[4].charAt(0)){
					player1++;
				}
				else
					player2++;
			}
			else if(rank(arr1)==6){
				System.out.println("sss");
				if(highCard(arr1,arr2)==1)
					player1++;
				else
					player2++;
			}
			else if(rank(arr1)==7){
				char a,b,a2,b2;
				if((precedence(arr1[0])==precedence(arr1[1]) && precedence(arr1[1])==precedence(arr1[2])) 
						){
					a = arr1[2].charAt(0);
					b = arr1[4].charAt(0);
				}else{
					a = arr1[2].charAt(0);
					b = arr1[1].charAt(0);
				}
				if((precedence(arr2[0])==precedence(arr2[1]) && precedence(arr2[1])==precedence(arr2[2])) 
						){
					a2 = arr2[2].charAt(0);
					b2 = arr2[4].charAt(0);
				}else{
					a2 = arr2[2].charAt(0);
					b2 = arr2[1].charAt(0);
				}
				if(a>a2){
					player1++;
				}else if(a2>a){
					player2++;
				}else{
					if(b>b2)
						player1++;
					else
						player2++;
				}
			}
			else if(rank(arr1)==8){
				char a = arr1[2].charAt(0);
				char b = arr2[2].charAt(0);
				if(a>b)
					player1++;
				else if(b>a)
					player2++;
				else{
					if(highCard(arr1,arr2)==1)
						player1++;
					else
						player2++;	
				}
			}
			else if(rank(arr1)==9){
				char a = arr1[4].charAt(0);
				char b = arr2[4].charAt(0);
				if(a>b)
					player1++;
				else
					player2++;
				
			}
		}
	}
	public static String[] sort(String arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
					if(precedence(arr[i])>precedence(arr[j])){
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
			}
		}
		return arr;
	}
	public static int precedence(String s){
		if(s.charAt(0)=='2')
			return 2;
		else if(s.charAt(0)=='3')
			return 3;
		else if(s.charAt(0)=='4')
			return 4;
		else if(s.charAt(0)=='5')
			return 5;
		else if(s.charAt(0)=='6')
			return 6;
		else if(s.charAt(0)=='7')
			return 7;
		else if(s.charAt(0)=='8')
			return 8;
		else if(s.charAt(0)=='9')
			return 9;
		else if(s.charAt(0)=='T')
			return 10;
		else if(s.charAt(0)=='J')
			return 11;
		else if(s.charAt(0)=='Q')
			return 12;
		else if(s.charAt(0)=='K')
			return 13;
		else if(s.charAt(0)=='A')
			return 14;
		else
			return 0;
	}
	public static boolean sameSuit(String arr[]){
		String s = "";
		for(int i=0;i<arr.length;i++){
			s += arr[i].charAt(1);
		}
		if(s.equals("HHHHH"))
			return true;
		else if(s.equals("DDDDD"))
			return true;
		else if(s.equals("SSSSS"))
			return true;
		else if(s.equals("CCCCC"))
			return true;
		else
			return false;
	}
	public static boolean consecutives(String arr[]){
		for(int i=arr.length-1;i>0;i--){
			int dif = precedence(arr[i])-precedence(arr[i-1]);
			if(dif!=1)
				return false;
		}
		return true;
	}
	public static boolean royalFlush(String arr[]){
		if(arr[0].charAt(0)=='T' && arr[1].charAt(0)=='J' && arr[2].charAt(0)=='Q' && 
				arr[3].charAt(0)=='K' && arr[4].charAt(0)=='A')
			return true;
		else 
			return false;
	}
	public static boolean straightFlush(String arr[]){
		if(sameSuit(arr) )
			if(consecutives(arr))
				return true;
			else
				return false;
		else
			return false;
	}
	public static boolean fourOfAKind(String arr[]){
		int count =0;
		for(int i=arr.length-1;i>0;i--){
			if(arr[i].charAt(0)!=arr[i-1].charAt(0))
				count = 0;
			int dif = precedence(arr[i])-precedence(arr[i-1]);
				if(dif==0)
					count++;
			if(count==3)
				return true;	
		}
			return false;
	}
	public static boolean pair(String s,String s2){
		int dif = precedence(s2)-precedence(s);
		if(dif==0)
			return true;
		return false;
	}
	public static boolean onePair(String arr[]){
		int count=0;
		for(int i=0;i+1<arr.length;i++){
			if(pair(arr[i],arr[i+1]))
				count++;
		}
		if(count==1)
			return true;
		else
			return false;
	}
	public static boolean twoPairs(String arr[]){
		int count=0;
		if(pair(arr[0],arr[1]) && pair(arr[2],arr[3])){
			count++;
		}
		if(pair(arr[0],arr[1]) && pair(arr[3],arr[4])){
			count++;
		}
		if(pair(arr[1],arr[2]) && pair(arr[3],arr[4])){
			count++;
		}
		
		if(count==1)
			return true;
		return false;
	}
	public static boolean threeOfAKind(String arr[]){
		int count =0;
		for(int i=arr.length-1;i>0;i--){
			if(arr[i].charAt(0) != arr[i-1].charAt(0))
			count = 0;
			int dif = precedence(arr[i])-precedence(arr[i-1]);
			if(dif==0)
				count++;
			if(count==2)
				return true;
		}
		return false;
	}
	public static boolean straight(String arr[]){
		if(consecutives(arr))
			return true;
		else
			return false;
	}
	public static boolean flush(String arr[]){
		if(sameSuit(arr))
			return true;
		else
			return false;
	}
	public static boolean fullHouse(String arr[]){
		if(threeOfAKind(arr)){
			if(arr[0].charAt(0)==arr[2].charAt(0)){
				if(pair(arr[3],arr[4]))
					return true;
			}
			else if(arr[2].charAt(0) == arr[4].charAt(0)){
				if(pair(arr[0],arr[1]))
					return true;
			}
		}
		return false;
	}
	public static int highCard(String arr1[],String arr2[]){
		for(int i=arr1.length-1;i>=0;i--){
			if(precedence(arr1[i])>precedence(arr2[i])){
				return 1;
			}
			else if(precedence(arr1[i])<precedence(arr2[i]))
				return 2;
			else if(precedence(arr1[i])==precedence(arr2[i]));
				//do nothing 
		}
		return 0;
	}
	
}
