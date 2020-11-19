import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void test1() {
        TestData.createUsersMock(5).forEach(u->System.out.println(u.toString()));
    }
}
