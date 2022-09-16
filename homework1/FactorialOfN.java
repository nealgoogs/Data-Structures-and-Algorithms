package homework1;

public class FactorialOfN {

	static int fact(int a) {
		if (a == 0)
			return 1;

		return a * fact(a - 1);
	}

}
