package za.ac.cput.Service;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.UserPayment;
import za.ac.cput.Factory.UserPaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserPaymentServicesTest {
    private static UserPaymentServices service = new UserPaymentServices();
    private static UserPayment userP = UserPaymentFactory.createUserPayment(userPayment.getPaymentId());

    @Test
    void create(){
        UserPayment created = service.create(userP);
        assertEquals(userP.getPaymentId(), created.paymentId);
        System.out.println("Created" + created);
    }

    @Test
    void read(){
        UserPayment read = (UserPayment) service.read(userP.paymentId);
        System.out.println("read" + read);
    }

    @Test
    void update() {
        UserPayment update = new UserPayment.Builder().copy(userP).setPaymentId().build();
        System.out.println("Update" + update);
    }


    @Test
    void delete(){
        service.delete("212121323");
        System.out.println("delete" + userP.getPaymentId() + "");
    }

}