package employee;

final class Clerk extends Emp 
{
		public Clerk() 
		{
			desig = "Clerk";
			sal = 3000;
		}
		public void raiseSalary() 
		{
			sal += 10000;
		}
	
}