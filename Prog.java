package employee;

final class Prog extends Emp 
{
	public Prog() 
	{
		desig = "Programmer";
		sal = 9000;
	}
	public void raiseSalary() 
	{
		sal += 50000;
	}
}