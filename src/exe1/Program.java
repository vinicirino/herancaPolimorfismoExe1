package exe1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Products: " + i + "data:");
			System.out.println("comon, used or imported (c/u/d");
			String tipe = sc.next();
			
		
			
			if (tipe == "c") {
					
			}else if (tipe == "u") {
				
			}else {
				
			}
				
		
		}
		
		sc.close();
		
		

	}

}
