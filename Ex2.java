/**
 * It looks like fib(46) is the largest value that can be computed with a
 * 32 bit int.
 *
 * It looks like fib(92) is the largest value that can be computed with a
 * 64 bit int.
 *
 * Pair programming exercise, Chris and George
 */

public class Ex2 {
	
	private long[] storeValues;
	
	public long memFibonacci(int number) {
		this.storeValues = new long[number];
		long longNumber = (long)number;
		if(number > 1L) {
			this.storeValues[0] = 1L;
			this.storeValues[1] = 1L;
			return fibonacciHelper(number);
		} else if (number == 1L) {
			return 1L;
		} else {
			return -1L;
		}
	}
	
	private long fibonacciHelper(long number) {
		if(number == 1L || number == 2L) {
			return 1L;
		} else {
			if(storeValues[(int)number - 1] == 0L) {
				long result = fibonacciHelper(number - 2L) + fibonacciHelper(number - 1L);
				storeValues[(int)number - 1] = result;
				return result;
			}
			else {
				return storeValues[(int)number - 1];
			}
		}
	}
	
	public long fibonacci(long number) {
		if(number==1L || number==2L) {
			return 1L;
		}
		else {
			return fibonacci(number - 2L) + fibonacci(number - 1L);
		}
	}
	
	public static void main(String[] args) {
		Ex2 test = new Ex2();
		test.launch();
	}
	
	public void launch() {
		//System.out.println(fibonacci(45));
		int n = 50;
		while(n <= 140) {
			System.out.println(Integer.toString(n) + ": " + memFibonacci(n));
			n++;
		}
	}
}