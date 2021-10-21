package za.ac.cput.Repository;

import za.ac.cput.Entity.UserPayment;

import java.util.Set;

public interface UserPaymentRepositoryInt extends Repository<UserPayment, String>{
    public Set<UserPayment>getAll();
}
