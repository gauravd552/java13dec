package array_written_14jan;

public class Employee6 {int e_id;
String e_name;
double e_salary;
MyDate6 d;
Department6 dept;

public Employee6(int e_id, String e_name, double e_salary, MyDate6 d, Department6 dept) {
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
	

}
