package inheritance;

public class EmployyeHired {
	int id;
	String name;
	Date1 d;
	
	

	public EmployyeHired(int id, String name, Date1 d) {
		
		this.id = id;
		this.name = name;
		this.d = d;
	}
	



	@Override
	public String toString() {
		return "EmployyeHired [id=" + id + ", name=" + name + ", d=" + d + "]";
	}




	public static void main(String[] args) {
		Date1 d= new Date1(10,24,2022);
		EmployyeHired e= new EmployyeHired(123,"Ram",d);
		
		System.out.println(e);
		
	}

}
