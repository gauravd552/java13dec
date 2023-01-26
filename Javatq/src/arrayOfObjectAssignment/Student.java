package arrayOfObjectAssignment;

import java.util.Scanner;

/*Create array of students, student has (roll, name, age, marks). Print only
Those students who have marks more than 60 and age is less than 15.*/

public class Student {
int roll;
String name;
int age;
int marks;

	public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
	
	
	
}

@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
}

public int getMarks() {
	return marks;
	
	
	
	
}

public void setMarks(int marks) {
	this.marks = marks;
	
	
}

	public static void main(String[] args) {
		
		Student s[]=new Student[2];
		Scanner sc=new Scanner(System.in);
		int flag=0;
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			System.out.println("Enter name..."+i);
			String name=sc.next();
			s[i].setName(name);
			System.out.println("Enter Roll no.."+i);
			int roll=sc.nextInt();
			s[i].setRoll(roll);
			System.out.println("Enter age is..."+i);
			int age=sc.nextInt();
			s[i].setAge(age);
			System.out.println("Enter marks..."+i);
			int marks=sc.nextInt(); 
			s[i].setMarks(marks);
			
			if(s[i].getMarks()>60 && s[i].getAge()<15)
			{
				flag=1;
			}
			if(flag==1)
			{
				
				
					System.out.println(s[i]);
				}
				}
			
		}
		
		
		

	}



