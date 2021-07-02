package employee;

final class Manger extends Emp
{
		public Manger() 
		{
			desig = "Manager";
			sal = 4000;
		}
		public void raiseSalary() 
		{
			sal += 20000;
		}
}