package Encapsul;

public class Test_book1 {

	public static void main(String[] args) {
		Book1 b=new Book1();
		b.setBook_name("Wings of fire");
		b.setAuthore_name("apj addul kalam");
		b.setBook_price(800);
		
		System.out.println("book details");
		System.out.println("book name :  "+b.getBook_name());
		System.out.println("authore name: "+b.getAuthore_name());
		System.out.println("book price:"+b.getBook_price());
		
		

	}

}
