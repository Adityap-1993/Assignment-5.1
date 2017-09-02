package assignment5_1;

public abstract class Employee {      // abstract class definition 
	
	protected int empno;              //taking instance variables
	protected String name;
	protected String address;
	
	Employee(int empno,String name,String address)    //parameterized constructor
	{
		this.empno=empno;                            //assigning values to variable 
		this.name=name;
		this.address=address;
	}

	
	
	Employee(){                                //  default constructor
		
		this.empno=-1;
		this.name=null;
		this.address=null;
		
	}
	
	
	public abstract void calculatesalary();          //abstract method

}//class ends

