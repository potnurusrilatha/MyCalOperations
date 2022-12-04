package Testcases;

import org.junit.Test;

import Calc.Addition;
import Calc.Division;
import Calc.average;
import Calc.multiply;
import Calc.subtraction;
import junit.framework.Assert;

public class testcases {
	
@Test
	public void t_01_test_add() {
		
		int actual;
		int expected=5;
		//create object
		Addition add=new Addition(2,3);
		//perform operation
		actual = add.performOperations();
		if(actual==expected)
		{
			//Test case is passed
			System.out.println("Test case is passed.Expected and actual Matched ");
			
		}
		else {
			//Test case is failed
			System.out.println("Test case is failed.Expected value is:" +expected +"actual value is:" + actual);
		}
			
		}
		
@Test
	public void t_02_test_subtaction() {
	
	 	int actual;
	 	int expected=17;
	 	//create object
	 	subtraction Subtraction=new subtraction(20,3);
	 	//perform operation
	 	actual = Subtraction.performOperations();
	 	
	 	if(actual==expected)
	 	{
	 		//Test case is passed
	 		System.out.println("Test case is passed.Expected and actual Matched ");
		
	 	}
	 		else {
	 			//Test case is failed
	 			System.out.println("Test case is failed.Expected value is:" +expected +"actual value is:" + actual);
	}
		
	}
			
			

			
@Test
	public void t_03_test_multiply() {
				

 			int actual;
 			int expected=60;
 			//create object
 			multiply Multiply=new multiply(20,3);
 			//perform operation
 			actual = Multiply.performOperations();
 	
 			if(actual==expected)
 			{
 				//Test case is passed
 				System.out.println("Test case is passed.Expected and actual Matched ");
	
 			}
 			else {
 			//Test case is failed
 			System.out.println("Test case is failed.Expected value is:" +expected +"actual value is:" + actual);
}
	
}


@Test
public void t_04_test_Division() {
					

 		float actual;
 		float expected=10;
 		//create object
 		Division division=new Division(20,2);
 		//perform operation
 		actual = division.performOperations();
 	
 		if(actual==expected)
 		{
 			//Test case is passed
 			System.out.println("Test case is passed.Expected and actual Matched ");
	
 		}
 			else {
 			//Test case is failed
 			System.out.println("Test case is failed.Expected value is:" +expected +"actual value is:" + actual);
}
	
}
@Test
	        public void t_05_test_average() {
						
						int num1=4;
						int num2=2;
						
						//Expected
						int expected=3;
						
						//steps to be done
						average Average=new average(num1,num2);
						int actual=Average.performOprations();
						
						//validations
						Assert.assertEquals(expected,actual);
}

}
