package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.UserPayment;
import za.ac.cput.Factory.UserPaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserPaymentRepositoryTest {
private static UserPaymentRepository repository =  new UserPaymentRepository();
private UserPayment uP = UserPaymentFactory.createUserPayment(userPayment.getPaymentId());

    @Test
    void create() {
        UserPayment created = repository.create(uP);
        assertEquals(uP.getPaymentId(), created.getPaymentId());
        System.out.println("User is:" + created);

    }

    @Test
    void read() {
        UserPayment read = repository.read(uP.getPaymentId());
        System.out.println("Read " + read);
    }

    @Test
    void update() {
        UserPayment updated = new UserPayment.Builder().copy(uP).setPaymentId().build();
        System.out.println("User updated" + updated);
    }

    @Test
    void delete() {
        repository.delete(uP.getPaymentId());
        System.out.println("Deleted " + uP.getPaymentId() + " ");
    }
}