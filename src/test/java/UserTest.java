import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class UserTest {

    private User user;
    private User user1;
    private User user2;

    @Before
    public void setUp() throws Exception {
        user = new User("Евгений", 35);
        user1 = new User("Марина", 34);
        user2 = new User("Алина", 7);
    }

    @Test
    public void getAllUsers() {
        List<User> actual = User.getAllUsers();
        List<User> expected = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAllUsersNoNULL() {
        List<User> actual = User.getAllUsers();
        Assert.assertNotNull(actual);
    }

    @Test
    public void getHowManyUsers() {
        int actual = User.getHowManyUsers();
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAllAgeUsers() {
        int actual = User.getAllAgeUsers();
        int expected = 35 + 34 + 7;
        Assert.assertEquals(actual, expected);
    }


}