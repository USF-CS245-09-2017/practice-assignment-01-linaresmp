//Maria Paula Linares
//CS 245 01

public class Fibonacci{
	public int fibonacci(int n, String type){
		if(type.equals("iterative")){
			return fibonacci_iterative(n);
		}else{
			return fibonacci_recursive(n);
		}
		

	}
	public int fibonacci_recursive(int n){
		if (n == 1 || n==0){
			return n;
		}
		else{
			return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
		}
	}
	public int fibonacci_iterative(int n){
		if (n == 0 || n ==1){
			return n; 
		}

		int answer = 0;
		int num1 =1;
		int num2 = 1;

		//starting at 2 because we checked 0 and 1 in if statement
		for (int a = 2; a < n; a++){
			answer = num2 + num1;
			num1 = num2;
			num2 = answer;
			

		 }
		 return answer;
	}
}