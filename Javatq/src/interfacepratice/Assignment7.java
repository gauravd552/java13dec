package interfacepratice;
/*What is output of following code?
interface X
{
 void methodX();
}
class Y implements X
{
 void methodX()
 {
 System.out.println("Method X");
 }
}*/

interface X
{
 void methodX();
}


class Y implements X
{
public void methodX()
 {
 System.out.println("Method X");
 }
}



public class Assignment7 {

	
	
	public static void main(String[] args) {
		Y z= new Y();
		z.methodX();
	}

}
