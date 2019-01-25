//Maria Paula Linares
//CS 245 01
public class Factorial{
	public int factorial(int n, String type){
		if(type.equals("iterative")){
			return factorial_iterative(n);
		}else{
			return factorial_recursive(n);
		}
	}
	public int factorial_recursive(int n){
		if(n <=1){
			return 1; 
		}
		return n*factorial_recursive(n-1);
	}
	public int factorial_iterative(int n){
		int total = 1; 
		for(int x = 1; x <= n; x++){
			total *=x;
		}
		return total;
	}
}