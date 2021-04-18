package se.Lexicon.Nils_Leandersson;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest
{
    @Test
    public void addition() {
        //Arrange
        double a = 3;
        double b = 4;
        String result;

        //Act
        result = App.Addition(a, b);

        //Assert
        assertEquals("The sum of 3.0 and 4.0 is: 7.0", result);
    }

    @Test
    public void additionMultiple() {
        //Arrange
        double[] terms = { 3, 4, 7, -2, 5 };
        String result;

        //Act
        result = App.AdditionArray(terms);

        //Assert
        assertEquals("The sum of 3.0 4.0 7.0 -2.0 5.0 is: 17.0", result);
    }

    @Test
    public void subtraction() {
        //Arrange
        double a = 5;
        double b = 3;
        String result;

        //Act
        result = App.Subtraction(a, b);

        //Assert
        assertEquals("The difference of 5.0 and 3.0 is: 2.0", result);
    }

    @Test
    public void subtractionArray() {
        //Arrange
        double minuend = 15;
        double[] subtrahends = { 3, 2, -2, 4, 1 };
        String result;

        //Act
        result = App.SubtractionArray(minuend, subtrahends);

        //Assert
        assertEquals("The difference of 15.0 and 3.0 2.0 -2.0 4.0 1.0 is: 7.0", result);
    }

    @Test
    public void division() {
        //Arrange
        double a = 21;
        double b = 3;
        String result;

        //Act
        result = App.Division(a, b);

        //Assert
        assertEquals("The quotient of 21.0 and 3.0 is: 7.0", result);
    }

    @Test
    public void division_by_zero() {
        //Arrange
        double a = 21;
        double b = 0;
        String result;

        //Act
        result = App.Division(a, b);

        //Assert
        assertEquals("Division by zero is not allowed", result);
    }

    @Test
    public void multiplication() {
        //Arrange
        double a = 3;
        double b = 7;
        String result;

        //Act
        result = App.Multiplication(a, b);

        //Assert
        assertEquals("The product of 3.0 and 7.0 is: 21.0", result);
    }
}
