
public class Employee {
	
	int id;
	String empname;
	double salary;
	int age;
	Employee(int a,String s,double sa)
	{
		id = a;
		empname = s;
		salary =sa;
	}
	
	public static void main(String[] args) {
		
		
		int id[] = {401,402,403};
		String empname[] = {"Raju","Surya","Navy"};
		double salary[] = {40000,50000,45000};
		
		for(int i = 0;i < 3;i++)
		{
			Employee e1 = new Employee(id[i],empname[i],salary[i]);
			System.out.println("Eid="+e1.id+"\nEname="+e1.empname+"\nEsalary="+e1.salary);
			System.out.println("----------------------------");
		}
		
		
		
		
	
	}

}
