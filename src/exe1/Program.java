package exe1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Products: #" + i);
			System.out.println("comon, used or imported (c/u/d)");
			char type = sc.next().charAt(0);
			System.out.println("name:");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("price:");
			Double price = sc.nextDouble();
				
			if (type == 'c') {
				list.add(new  Product(name, price));
			}else if (type == 'u') {
				System.out.println("Manufactured date (DD/MM/YYYY):");
				String manufact = sc.next();
				list.add(new UsedProduct(name, price, sdf.parse(manufact)));		
			}else {	
				System.out.println("Customs fee:");
				Double custom = sc.nextDouble();		
				list.add(new ImportedProduct(name, price, custom));	
			}		
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}
