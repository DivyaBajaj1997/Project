
public class EmployeeMain {
	
	public void print(Employee[] e)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("The id of employee " + i +" is " + e[i].getId() + ", name is " + e[i].getName() + " and balance is " + e[i].getBalance() );
		}
	}
	
	public static void main(String[] args){
		Employee[] empStore = new Employee[5];
		
		empStore[0]= new Employee(1, "Divya"); 
		empStore[1]= new Employee(2, "Riya"); 
		empStore[2]= new Employee(3, "Aditi"); 
		empStore[3]= new Employee(4, "Maneel"); 
		empStore[4]= new Employee(5, "Ananya"); 
		
		empStore[1].addsalary(3000);
		empStore[2].addsalary(30009.68);
		
		EmployeeMain e1 =  new EmployeeMain();
		e1.print(empStore);
		
		Manager m = new Manager(1,"Divya",45);
		m.addsalary(56.89);
		System.out.println(m.details());
		
		
		Employee e = new Manager(2,"riya",68);
		
	}
}
