package three;

public class cost {

	double cost1(String quality, double area, String automate){
		
		double amt=0.0;
		if(quality.equalsIgnoreCase("Standard") && automate.equalsIgnoreCase("No"))
			amt=area*1200;
		
		if(quality.equalsIgnoreCase("Standard") && automate.equalsIgnoreCase("Yes"))
			System.out.println("Automated House not possible with Standard materials");
		
		if(quality.equalsIgnoreCase("Above") && automate.equalsIgnoreCase("No"))
			amt=area*1500;
		
		if(quality.equalsIgnoreCase("Above") && automate.equalsIgnoreCase("Yes"))
			System.out.println("Automated House not possible with Above Standard Materials");
		
		if(quality.equalsIgnoreCase("High") && automate.equalsIgnoreCase("No"))
			amt=area*1800;
		
		if(quality.equalsIgnoreCase("High") && automate.equalsIgnoreCase("Yes"))
			amt=area*2500;
		
		return amt;
	}
}
