package assignment5_1;

public class Empsalary extends Employee {            //extending abstract class
	
	protected double salary;                             //instance variable 
	
	Empsalary(int no,String name,String address,double salary)   //parameterized constructor of subclass
	{
		super(no,name,address);                                 //calling parameterized constructor of superclass
		this.salary=salary;
		
	}
	
	Empsalary()                                          //default constructor
	{
		super();
		salary=-1.0;
	}
	
	public void calculatesalary()                //overriding abstract method to calculate salary
	{
		System.out.println(" ");
		System.out.println("The Employee " + name + " with Employee number " + empno + " resident of " + address + " has salary Rs: " + salary + "." );
	}

}//class ends
