
public class Employee1 {
	
	int id;
	String name;
	double sal;
	
	Employee1(int a,String s,double sa)
	{
		System.out.println("Object created");
		id = a;
		name = s;
		sal = sa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***JVM enters***");
		
		Employee1 emp = new Employee1(401,"Ganesh",50000);
		System.out.println("EID= "+emp.id);
		System.out.println("ENAME= "+emp.name);
		System.out.println("ESAL= "+emp.sal);
		System.out.println("-----------------------");
		
		Employee1 emp1 = new Employee1(444,"Sudheer",45000);
		System.out.println("EID= "+emp1.id);
		System.out.println("ENAME= "+emp1.name);
		System.out.println("ESAL= "+emp1.sal);
		
		System.out.println("***JVM exit***");

	}

}
