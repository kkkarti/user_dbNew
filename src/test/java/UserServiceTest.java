
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {
    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserServiceImpl();
        userService.createTable();
    }

    @Test
    public void testAddUser() {
        userService.addUser(new User("Alice", "Johnson", (byte) 25));
        List<User> users = userService.getAllUsers();
        assertEquals(1, users.size());
    }

    @Test
    public void testGetAllUsers() {
        userService.addUser(new User("Bob", "Smith", (byte) 30));
        List<User> users = userService.getAllUsers();
        assertFalse(users.isEmpty());
    }

    @Test
    public void testCleanTable() {
        userService.addUser(new User("Charlie", "Brown", (byte) 28));
        userService.cleanTable();
        List<User> users = userService.getAllUsers();
        assertTrue(users.isEmpty());
    }

    @Test
    public void testDropTable() {
        userService.dropTable();
    }
}