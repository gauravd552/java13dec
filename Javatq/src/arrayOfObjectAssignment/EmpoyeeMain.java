package arrayOfObjectAssignment;

import java.util.Scanner;

public class EmpoyeeMain {

	public static void main(String[] args) {
	Employee e[]=new Employee[3];
	for(int i=0;i<e.length;i++)
	{
		Department d=new Department();
		Scanner sc=new Scanner(System.in);
		 e[i]=new Employee();
		 System.out.println("Enter Employee name is...");
		 String emp_name=sc.nextLine();
		 e[i].setEmp_name(emp_name);
		
		 System.out.println("Enter Employee id is...");
		 int id=sc.nextInt();
		 e[i].setEmp_id(id);
		 
		 e[i].setDept(d);//object pass kela dept cha
		 System.out.println("Enter Department name..");
		 String dept_name=sc.next();
		 e[i].getDept().setDept_name(dept_name);;
		
		 System.out.println("Enter Department id");
		 int dept_id=sc.nextInt();
		 e[i].getDept().setDept_id(id);
		 
		 
		 
	}
	for(Employee e1:e) {
		System.out.println(e1);
	}

	}

}
