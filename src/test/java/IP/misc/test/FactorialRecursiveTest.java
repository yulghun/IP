package IP.misc.test;

import misc.FactorialRecursive;
import org.junit.Assert;
import org.junit.Test;

public class FactorialRecursiveTest {
    @Test
    public void factorialTest() {
        // Arrange
        FactorialRecursive factorialRecursive = new FactorialRecursive();

        // Act
        int actual = factorialRecursive.factorial(4);

        // Assert
        int expected = 24;
        Assert.assertEquals(expected, actual);

    }

}

