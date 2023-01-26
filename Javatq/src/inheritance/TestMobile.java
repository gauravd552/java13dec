package inheritance;

public class TestMobile {

	public static void main(String[] args) {
		Product p= new Product(123,"vivo","v20");
		System.out.println("mobile id is.."+p.id);
		System.out.println("mobile name is.."+p.name);
		System.out.println("mobile model no is.."+ p.model_number);
	}

}
