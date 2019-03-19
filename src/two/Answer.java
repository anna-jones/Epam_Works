package two;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Answer {

	private static DecimalFormat df = new DecimalFormat(".##");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intcalc obj= new Intcalc();
		Scanner sc= new Scanner(System.in);
		int flag=0;
		
		while(flag==0){
	
		System.out.println("Interest Calculator");
		System.out.println("1: Simple Interest");
		System.out.println("2: Compound Interest");
		System.out.println("3: EXIT");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch){
		
		case 1:
		
			System.out.println("Enter the Principle");
			double p=sc.nextDouble();
			
			System.out.println("Enter the Rate");
			double r=sc.nextDouble();
			
			System.out.println("Enter the Time");
			double t=sc.nextDouble();
			
			System.out.println("Simple Interest is: " +df.format(obj.simple(p, r, t)));
			break;
			
		case 2:
			
			System.out.println("Enter the Principle");
			double p1=sc.nextDouble();
			
			System.out.println("Enter the Rate");
			double r1=sc.nextDouble();
			
			System.out.println("Enter the Time");
			double t1=sc.nextDouble();
			
			System.out.println("Compound Interest is: " +df.format(obj.compound(p1, r1, t1)));
			break;
			
		case 3:
			flag=1;
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
		}
		}
	}

}
