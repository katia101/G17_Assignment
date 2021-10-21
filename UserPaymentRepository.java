package za.ac.cput.Repository;

import za.ac.cput.Entity.UserPayment;

import java.util.List;
import java.util.Set;

public class UserPaymentRepository implements UserPaymentRepositoryInt{
    private List<UserPayment> userPayDB;

    public UserPaymentRepository(){
        this.userPayDB = userPayDB;
    }


    @Override
    public UserPayment create(UserPayment userPayment) {
        return null;
    }

    @Override
    public UserPayment read(String paymentId) {
        UserPayment userPayment = null;

        for (UserPayment userp:userPayDB) {
            if (userPayment.getPaymentId().equalsIgnoreCase(paymentId)) {
                userPayment = userp;
                break;
            }
        }
        return userPayment;
    }

    @Override
    public UserPayment update(UserPayment userPayment) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
    public Set<UserPayment> getAll(){
        return (Set<UserPayment>) userPayDB;
    }
}
