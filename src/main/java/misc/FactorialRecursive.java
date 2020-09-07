package misc;

/**
 * Recursive definition: a function is defined in terms of smaller (parameter) version of itself.
 *
 * 1. Every recursive definition must have one (or more) base cases.
 * 2. The general case eventually must be reduced to a base case.
 * 3. The base case stops the recursion.
 */

public class FactorialRecursive {

    public int factorial(int n) {
        // base case
        if (n == 0 ) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
