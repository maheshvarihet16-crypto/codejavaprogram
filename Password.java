import java.util.Scanner;
class Password{
	 static boolean isValidPassword(String p){
		int digit=0;
		
		if(p.length()<8){
			return false;
		}
		
		for(int i=0;i<p.length();i++){
			char ch=p.charAt(i);
			if((ch>='a'&& ch>='z') || (ch>='A' && ch>='Z')){
			 
			}
			else if(ch>='0'&& ch<='9'){
				digit++;
			}
			else{
				return false;
			}
		}
		
		if(digit>2){
			return false;
			}
			else{
				return true;
			}
	}
	public static void main(String[] args){
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter password:");
		String p=sc.nextLine();
		
		if( isValidPassword(p) ){
			System.out.println("Password is valid");
		}
		else{
			System.out.println("Invalid password");
		}
	}
}