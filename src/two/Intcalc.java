package two;

public class Intcalc {
	
	double compound(double principle, double rate, double time){
		
		double amount=principle*(Math.pow((1+rate/100), time));
		
		return amount-principle;
	}
	
	double simple(double principle, double rate, double time){
		
		return (principle*rate*time)/100;
	}
	
}
