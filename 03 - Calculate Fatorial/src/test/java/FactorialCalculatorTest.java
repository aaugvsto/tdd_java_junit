import dev.augusto.FactorialCalculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void Test_Calculate_Positive_Number(){
        //Arrange
        int number = 2;

        //Act
        FactorialCalculator calculator = new FactorialCalculator(number);

        //Assert
        assertEquals(number, calculator.GetNumber());
        assertEquals(2, calculator.GetResult());
    }

    @Test
    public void Test_Calculate_Negative_Number(){
        //Arrange
        int number = -10;

        //Act
        FactorialCalculator calculator = new FactorialCalculator(number);

        //Assert
        assertEquals(number, calculator.GetNumber());
        assertEquals(number, calculator.GetResult());
    }
}



