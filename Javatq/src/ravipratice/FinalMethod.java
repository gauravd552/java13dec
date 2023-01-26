package ravipratice;//final method can not override
 class Sample{//final method can be overloaded 
	 final void display() {
		 
		 System.out.println("Gaurav");
		 
	 }
	 void display(int x) {
		 
	 }
 }
public class FinalMethod extends Sample {
	
	void display() {
		System.out.println("Ravi");
	}

	public static void main(String[] args) {
		

	}

}
