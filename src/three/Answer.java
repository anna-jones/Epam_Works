package three;

import java.util.*;
public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cost obj= new cost();
		Scanner sc= new Scanner(System.in);
        int flag=0;
		
		while(flag==0){
	
		System.out.println("1: Estimated Cost");
		System.out.println("2: Exit");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch){
		
		case 1:
			
			System.out.println("Enter quality of materials: Standard, Above or High");
			String quality=sc.next();
			
			System.out.println("Enter the total area");
			double area=sc.nextDouble();
			
			System.out.println("Enter Yes if you want fully automated house else No");
			String auto=sc.next();
			
			System.out.println("Estimated House Construction Cost: " +obj.cost1(quality, area, auto));
			break;
			
		case 2:
			flag=1;
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
		}
	}	
	}

}
