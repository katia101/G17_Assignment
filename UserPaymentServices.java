package za.ac.cput.Service;
import za.ac.cput.Entity.UserPayment;
import za.ac.cput.Repository.UserPaymentRepository;

import java.util.Set;


public class UserPaymentServices implements UserPaymentServiceInt{

    private static UserPaymentServices service = null;
    private UserPaymentRepository repository;

    public UserPaymentServices() {
        this.repository = UserPaymentServices.service.repository;
    }

    public static UserPaymentServices getService() {
        if (service == null) service = new UserPaymentServices();
        return service;
    }

    @Override
    public UserPayment create(UserPayment userPayment) {
        return this.repository.create(userPayment);
    }

    @Override
    public UserPayment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public UserPayment update(UserPayment userPayment) {
        return this.repository.update(userPayment);
    }

    @Override
    public boolean delete(String s) {
        this.repository.delete(s);
        return false;
    }

    public Set<UserPayment> getAll() {
        return this.repository.getAll();

    }

}
