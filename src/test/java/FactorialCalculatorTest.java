import dev.augusto.FactorialCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void Testa_Calculo_Fatorial_Igual_a_Zero(){
        var result = new FactorialCalculator(0)
                .GetResult();

        assertEquals(1, result);
    }
}



