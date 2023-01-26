package arrayOfObjectAssignment;
/*Employee class with fields (empno, empname, dept) where dept is object of
department class with fields (deptId, deptname) Write a program to create
array of 3 employees each employee will have different department.*/
public class Department {
	int dept_id;
	String dept_name;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
	
	

}
