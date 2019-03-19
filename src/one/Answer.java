package one;

import java.util.*;
public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc obj= new Calc();
		Scanner sc= new Scanner(System.in);
		int flag=0;
		
		while(flag==0){
	
		System.out.println("Calculator");
		System.out.println("1: Addition");
		System.out.println("2: Multiplication");
		System.out.println("3: Division");
		System.out.println("4: EXIT");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch){
		
		case 1:
			System.out.println("Enter the total numbers you want to add");
			int n=sc.nextInt();
			
			int arr[]= new int[n];
			
			System.out.println("Enter the numbers");
			for(int i=0; i<n; i++){
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Sum is: " +obj.sum(arr));
			break;
			
		case 2:
			
			System.out.println("Enter the total numbers you want to multiply");
			int n1=sc.nextInt();
			
			int arr1[]= new int[n1];
			System.out.println("Enter the numbers");
			for(int i=0; i<n1; i++){
				arr1[i]=sc.nextInt();
			}
			
			System.out.println("Product is: " +obj.multiply(arr1));
			break;
			
		case 3:
			
			System.out.println("Enter the dividend");
			int n22=sc.nextInt();
			
			System.out.println("Enter the divisor");
			int n23=sc.nextInt();
			
			System.out.println("Quotient is: " +obj.div(n22, n23));
			break;
			
		case 4:
			flag=1;
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
		}
		}
	}
}
