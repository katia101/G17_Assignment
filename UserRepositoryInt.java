package za.ac.cput.Repository;

import za.ac.cput.Entity.User;

import java.util.Set;

public interface UserRepositoryInt extends Repository<User, String> {
    public Set<User> getAll();
}
