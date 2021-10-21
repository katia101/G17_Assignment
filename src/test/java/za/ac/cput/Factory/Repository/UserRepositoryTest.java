package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
private static UserRepository repository = new UserRepository();
private User user= UserFactory.createUser("Mziyanda","Mwanda");

    @Test
    void create() {
        User created = repository.create(user);
        assertEquals(user.getUserId(), created.getUserId());
        System.out.println("User is:" + created);

    }


    @Test
    void read() {
        User read = repository.read(user.getUserId());
        System.out.println("Read " + read);
    }

    @Test
    void update() {
        User updated = new User.Builder().copy(user).setFirstName("Sesethu").build();
        System.out.println("User updated" + updated);
    }

    @Test
    void delete() {
        repository.delete(user.getUserId());
        System.out.println("Deleted " + user.getUserId() + " ");
    }
}