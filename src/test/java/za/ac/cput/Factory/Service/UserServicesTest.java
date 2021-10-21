package za.ac.cput.Service;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@FixMethodOrder(MethodSorters.JVM)
class UserServicesTest {
    private static UserServices service = new UserServices();
    private static User user = UserFactory.createUser("Mzi", "Mwanda");

    @Test
    void create(){
        User created = service.create(user);
        assertEquals(user.getUserId(), created.getUserId());
        System.out.println("Created" + created);
    }

    @Test
    void read(){
        User read = (User) service.read(user.getUserId());
        System.out.println("read" + read);
    }

    @Test
    void update(){
        User update = new User.Builder().copy(user).setFirstName("Mzi").build();
        System.out.println("Update" + update);
    }

    @Test
    void delete(){
        service.delete("Mzi");
        System.out.println("delete" + user.getUserId() + "");
    }

}