import dev.augusto.PasswordValidator;
import org.junit.*;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    public void Should_Throw_Exception_When_Password_Fewer_To_Eight_Character(){
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
}
