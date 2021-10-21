package za.ac.cput.Service;

import za.ac.cput.Entity.User;

import java.util.Set;

public interface UserServiceInt extends Services<User, String>{
    public Set<User> getAll();
}
