package interfacepratice;
/*Create interface Cake with a method declared as bake. Create 2 classes
Strawberry, BlackForest both implementing Cake interface.*/
 interface cake{
	  void bake();
 }
 
 class  Strawberry implements cake{

	@Override
	public void bake() {
		System.out.println(" Strawberry baking...");
		
	}
	 
 }
 
 class BlackForest implements cake{

	@Override
	public void bake() {
		System.out.println(" BlackForest baking...");
	}
	 
 }
 
public class Assignment6 {

	public static void main(String[] args) {
		
		cake c;
		c=new BlackForest();
		c.bake();
		c=new Strawberry();
		c.bake();
	}

}
