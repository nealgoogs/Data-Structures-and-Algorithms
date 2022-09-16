package homework1;

public class Fibonacci {
	static int fib(int a) {
		if (a <= 1)
			return a;
		return fib(a - 1) + fib(a - 2);
	}

}
