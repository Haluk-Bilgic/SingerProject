import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Be� Basamakl� Bir Say� Giriniz:");
		int sayi=scan.nextInt();
	
		int a=sayi/10000;
		int b=(sayi%10000)/1000;
		int d=(sayi%100)/10;
		int e=sayi%10;
		
		if(a==e&&b==d){
			System.out.println("Bu Say� palindorem say�s�d�r..");
		}else{
			System.out.println("Bu Say� palindorem say�s� de�ildir..");
			
		}
		
		
	}

}
