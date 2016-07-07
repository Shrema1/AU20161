package demoProject;

import java.util.Scanner;

public class demoClass implements interFace {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public Integer subtract(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public Integer divide(Integer a, Integer b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return (a/b);
	}

	@Override
	public Integer multiply(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a*b);
	}
public static void main(String[]args)
{
	demoClass obj=new demoClass();
	Integer a,b,choice;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number");
	a=input.nextInt();
	System.out.println("Enter second number");
	b=input.nextInt();
	System.out.println("Enter your selection:\n 1)Add \n 2)Subtract \n 3)Divide \n 4)Multiply\n");
	choice=input.nextInt();
	switch(choice){
	case 1:System.out.println(obj.add(a,b));
	break;
	case 2:System.out.println(obj.subtract(a,b));
	break;
	case 3:
		try
		{
			System.out.println(obj.divide(a,b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide by zero vdfdg");
		}
	break;
	case 4:System.out.println(obj.multiply(a,b));
	break;
	default:System.out.println("Invalid choice");
	}
}

}
