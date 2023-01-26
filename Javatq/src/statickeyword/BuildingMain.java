package statickeyword;

public class BuildingMain {
	
	static String b_name="Ram residency";
	int flat_no;
	int no_of_members;
	char wing='A';
	static
	{
		 char wing='A';
	}
	
	//to make constructor
	public BuildingMain(int flat_no, int no_of_members) {
	int _flat_no;
	this.flat_no=flat_no;
	this.no_of_members = no_of_members;
	}
	void display()
	{
		System.out.println("Wing is...."+wing);
		System.out.println("building name.."+ b_name);
	System.out.println("flat no,,,"+flat_no);
	System.out.println("no of members"+ no_of_members);
	}
	static void gardenArea()
	{
		System.out.println("gardrn area is common to all residents");
	}

	public static void main(String[] args) {
		b_name="RRR residency";
		gardenArea();
		System.out.println("building name.."+ b_name);
		BuildingMain b1= new BuildingMain(101,3);
		b1.display();
		System.out.println(b1.flat_no);
		BuildingMain b2= new BuildingMain(102,4);
		b2.display();
		BuildingMain b3= new BuildingMain(103,2);
		b3.display();
		BuildingMain b4= new BuildingMain(104,5);
		b4.display();
		
		
	}

}

