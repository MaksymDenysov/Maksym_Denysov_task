import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static List<User> createUsersMock(int usersAmount) {
        Faker faker = new Faker();
        List<User> users = new ArrayList<>();

        for (int i = 0; i < usersAmount; i++) {
            User user = new User(faker.number().digits(9), faker.internet().emailAddress(), faker.name().firstName(), faker.name().lastName(),faker.address().city(),faker.address().country());
            users.add(user);
        }
        return users;
    }
}
