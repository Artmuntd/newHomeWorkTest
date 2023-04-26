import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestUser {

    private  User user;

    @BeforeEach
    public void setUp() {
        user = new User("Артем",  "test@yyandex.ru");
    }
    @Test
    public void testUserCreat(){
              assertEquals("Артем", user.getLogin());
              assertEquals("test@yyandex.ru", user.getEmail());
    }
    @Test
    public void testUserCreationWithoutParameters() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }



    @Test
    public void testInvalidEmail() {
        String invalidEmail = "yandexx";
        User user = new User();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new User("login",invalidEmail));
        assertEquals("Invalid email address", exception.getMessage());
        assertNull(user.getEmail());
    }

    @Test
    public void testLoginEmail(){
        User user = new User("Артем", "test@yyandex.ru");

        assertNotEquals(user.getLogin(), user.getEmail());
    }


}
