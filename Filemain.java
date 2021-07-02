package employee;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


 class Filemain
{	
	public static void main(String[] args) 
	{
		try 
		{
			File file = new File("C://Users//DevaRaj//Desktop//java//file.txt");
			file.createNewFile();
			PrintWriter writer = new PrintWriter(new FileOutputStream(file,true));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Emp> employee = new ArrayList<Emp>();
		int Ch = 0, innerMenuChoice = 0;
	
		do {
				System.out.print("\n\n1.CREATE\n2.DISPLAY\n3.RAISESALARY\n4.EXIT\nENTER YOUR CHOICE: ");
				Ch = Integer.parseInt(br.readLine());
				switch(Ch) 
				{
				case 1: 
					{
					do 
					{
							System.out.print("\n\n1.CLERK\n2.MANAGER\n3.PROGRAMMER\n4.EXIT\nENTER YOUR CHOICE: ");
							innerMenuChoice = Integer.parseInt(br.readLine());
							Emp emp = null;
							switch(innerMenuChoice) 
							{
								case 1: emp = new Clerk();
								break;
								case 2: emp = new Manger();
						        break;
								case 3: emp = new Prog();
								break;
								case 4: break;
								default: System.out.print("\n\ninvalid entry...!");
						        break;
							}
							if(innerMenuChoice == 1 || innerMenuChoice == 2 || innerMenuChoice == 3) 
							{
								boolean existing = false;
								for( Emp k : employee) 
								{
									if(k.name.equals(emp.name) && k.age == emp.age) 
									{
										System.out.print("\nRecord already exists...");
										existing = true;
										break;
									}
								}
								if(!existing) 
								{
									employee.add(emp);
									writer.println("------------------------------------------------------");
									writer.println("id is: "+emp.id);
									writer.println("Name is :"+emp.name);
									writer.println("Age is :"+emp.age);
									writer.println("Sal is :"+emp.sal);
									writer.println("Desig is :"+emp.desig);
									writer.println("-------------------------------------------------------");
									writer.flush();

								}
							 }
					}	while(innerMenuChoice != 4);
						break;
					}
				case 2: 
					{
					if(employee.size() == 0) 
						{
							System.out.print("\n\nNorecords found.....?");
							break;
						}
					for(Emp e:employee)e.display();
					break;
					}
				case 3: 
					{
					if(employee.size() == 0) 
						{
							System.out.print("\n\nNorecords found.....?");
							break;
						}
					for(Emp e:employee) e.raiseSalary();
							System.out.print("\n\nSalary raised...");
							break;
					}
				case 4: System.out.print("\nExiting....!");
						break;
				default: System.out.print("\nInvalid choice....$");
				
				}
		}	while(Ch != 4);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}