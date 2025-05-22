import dev.augusto.PasswordValidator;
import org.junit.*;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void Should_Throw_Exception_When_Password_Fewer_To_Eight_Characters(){
        //Arrange
        String password = "123456";
        PasswordValidator validator = new PasswordValidator(password);

        try
        {
            // Act
            validator.Validate();
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException ex)
        {
            // Assert
            assertEquals("Password must be at least 8 characters", ex.getMessage());
        }
    }

    @Test
    public void Should_Return_True_When_Password_Has_At_Least_Eight_Characters() {
        //Arrange
        String password = "12345678";
        PasswordValidator validator = new PasswordValidator(password);

        //Act
        boolean result = validator.Validate();

        // Assert
        assertTrue(result);
    }
    
    @Test
    public void Should_Throw_Exception_When_Password_Has_Less_Than_Two_Digits() {
    // Arrange
    String password = "abcdefghi1234!!"; // Sem nenhuma letra Maiúscula
    PasswordValidator validator = new PasswordValidator(password);

        try {
            // Act
            validator.Validate();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // Assert
            assertEquals("A senha deve conter algum caracter maiúsculo", ex.getMessage());
        }
    }

    
}
