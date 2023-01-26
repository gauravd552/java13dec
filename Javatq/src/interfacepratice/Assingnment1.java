package interfacepratice;
/*1. What is the output of following code
class Base {
 public final void show() {
 System.out.println("Base::show() called");
 }
}
class Derived extends Base {
 public void show() {
 System.out.println("Derived::show() called");
 }
}
public class Main {
 public static void main(String[] args) {
 Base b = new Derived();;
 b.show();
 }
}*/
class Base {
	 public final void show() {
	 System.out.println("Base::show() called");
	 }
	}
class Derived extends Base {
	 public void show() {
	 System.out.println("Derived::show() called");
	 }
	}
public class Assingnment1 {

	public static void main(String[] args) {
		Base b = new Derived();;
		 b.show();
	}

}
