package array_written_14jan;



import java.util.Scanner;
 class Department6 {

	int d_id;
	String d_name;
	
	public Department6(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}
	
	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	@Override
	public String toString() {
		return "Department6 [d_id=" + d_id + ", d_name=" + d_name + "]";
	}

}
 class MyDate6 {

	int date;
	String month;
	int year;
	public MyDate6(int date, String month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate6 [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

}

public class Assignment {

	int e_id;
	String e_name;
	double e_salary;
	MyDate6 d;
	Department6 dept;

	public Assignment(int e_id, String e_name, double e_salary, MyDate6 d, Department6 dept) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_salary = e_salary;
		this.d = d;
		this.dept = dept;
	}
	
	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public double getE_salary() {
		return e_salary;
	}

	public void setE_salary(double e_salary) {
		this.e_salary = e_salary;
	}

	public MyDate6 getD() {
		return d;
	}

	public void setD(MyDate6 d) {
		this.d = d;
	}

	public Department6 getDept() {
		return dept;
	}

	public void setDept(Department6 dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee6 [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", d=" + d + ", dept="
				+ dept + "]";
	}

	public static void main(String[] args) {
		Assignment empl[] = new Assignment[2];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < empl.length; i++) {
			System.out.println("Enter Employee Id : ");
			int e_id = in.nextInt();
			System.out.println("Enter Employee Name : ");
			String e_name = in.next();
			System.out.println(" Enter Employee Salary : ");
			double e_salary = in.nextDouble();
			System.out.println("Enter Department Id : ");
			int d_id = in.nextInt();
			System.out.println("Enter Department Name : ");
			String d_name = in.next();
			System.out.println("Enter Date : ");
			int date = in.nextInt();
			System.out.println("Enter Month : ");
			String month = in.next();
			System.out.println(" Enter Year : ");
			int year = in.nextInt();

			MyDate6 d = new MyDate6(date, month, year);
			Department6 dept = new Department6(d_id, d_name);
			empl[i] = new Assignment(e_id, e_name, e_salary, d, dept);
		}
//		for (int i = 0; i < empl.length; i++) {
//			System.out.println(" " + empl[i]);
//		}
        for(int i=0;i<empl.length-1;i++)
        {
        	for(int j=i+1;j<empl.length;j++)
        	{
        		if(empl[i].getDept().getD_name().equals(empl[j].getDept().getD_name()))
        		{    
        			System.out.println(empl[i]);
        			System.out.println(empl[j]);
        		}
        	}
        }
	}

}