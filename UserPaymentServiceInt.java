package za.ac.cput.Service;

import za.ac.cput.Entity.UserPayment;

import java.util.Set;

public interface UserPaymentServiceInt extends Services<UserPayment, String>{
    public Set<UserPayment> getAll();
}
