package employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Emp
{
	String name, desig;
	int age, sal;
	int id;
	public Emp() 
	{
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id");
		id = Integer.parseInt(br.readLine());
		System.out.print("\n Enter Name ");
		name = br.readLine();
		System.out.print("\nEnter Age : ");
		age = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{

		}
	}

	public void display()
	{
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Salary is :"+sal);
		System.out.println("Designation is :"+desig);
	}

	public abstract void raiseSalary();
}
