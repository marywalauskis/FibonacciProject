import java.util.Scanner;

/**
 * Fibonacci program - Iterative and Recursive Functions
 * Fibonacci series - 0,1,1,2,3,5,8,13....
 * 
 * @author Mary Walauskis
 *
 */
public class FibonacciIterativeAndRecursive {
	
	/**
	 * Fibonacci - Iterative
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFibNum = 1;
		
		for(int i = 2; i < n; i++) {
			int temp = fib;
			fib+= prevFibNum;
			prevFibNum = temp;
		}
		return fib;
	}
	
	/**
	 * Fibonacci - Recursion 
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		FibonacciIterativeAndRecursive fib = new FibonacciIterativeAndRecursive();
		
		
		System.out.println("What element of Fibonacci would you like displayed?");
		int input = scan.nextInt();
		
		System.out.println("Iterative version:");
		System.out.println(fib.fibonacciIterative(input));
		long startTime = System.nanoTime();
		System.out.println("Time: " + startTime);
		
		System.out.println("Recursive version:");
		System.out.println(fib.fibonacciRecursive(input));
		startTime = System.nanoTime();
		System.out.println("Time: " + startTime);
	}
}