package array_written_14jan;

public class EmployeeTest {
	

	
		public static void main(String[] args) {
			Dept d1 = new Dept(1, "IT");
			MyDate md1 = new MyDate(10, 8, 1998);

			Employee e1 = new Employee(1, "Prajakta", 10000.0, md1, d1);
			Employee e2 = new Employee(2, "Prachi", 20000.0, md1, d1);
			Employee e3 = new Employee(3, "Hurry", 30000.0, md1, d1);

			Employee[] empList = { e1, e2, e3 };

			for (Employee e : empList) {
				System.out.println(e);
			}
		}

	}


