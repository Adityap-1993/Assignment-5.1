package assignment5_1;

public class Main {            //main class definition

	public static void main(String[] args) {          //main starts here 
		
		Empsalary e1=new Empsalary(4533,"Aman","Maharashtra",12400.50);    //creating object 1
		
		Empsalary e2=new Empsalary(5622,"Baman","Karnataka",2500.30);     //creating object 2
		
		e1.calculatesalary();            //calling methods for objects
		e2.calculatesalary();

	}

}
