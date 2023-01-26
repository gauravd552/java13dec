package aggreation;

import java.util.Scanner;

public class SupplierMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Supplier id");
		int id = sc.nextInt();
		System.out.println("Enter supplier name");
		String name=sc.next();
		
		System.out.println("Enter item name");
		String i_name=sc.next();
		
		System.out.println("Enter item price");
		int price= sc.nextInt();
		
		
		Supplier s = new Supplier();
		s.set_id(id);
		s.setName(name);
		Item i = new Item();
		s.setI(i);
		s.getI().setName(i_name);
		s.getI().setPrice(price);
		
		System.out.println("supplier id is ..."+ s.get_id());
		System.out.println("supplier id name..."+s.getName());
		System.out.println("item name is"+ s.getI().getName());
		System.out.println("item price is..."+s.getI().getPrice());

}
}
