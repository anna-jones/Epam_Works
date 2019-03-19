package one;

import java.util.ArrayList;

public class Calc {
	
	int sum(int arr[]){
		
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];
		}
		
		return sum;
	}
	
	int div(int n, int n1){
		
		return n/n1;
	}
	
	int multiply(int arr[]){
		
		int product=1;
		for(int i=0; i<arr.length; i++){
			product=product*arr[i];
		}
		
		return product;
	}

}
