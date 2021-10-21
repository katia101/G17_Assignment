package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Entity.User;
import za.ac.cput.Repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServices implements UserServiceInt{
private static UserServices service = null;
private UserRepository repository;

    public UserServices() {
        this.repository = UserServices.service.repository;
    }

    public static UserServices getService() {
        if (service == null) service = new UserServices();
        return service;
    }


    @Override
    public User create(User user) {

        return this.repository.create(user);
    }

    @Override
    public User read(String s) {
        return this.repository.read(s);
    }

    @Override
    public User update(User user) {
        return this.repository.update(user);
    }

    @Override
    public boolean delete(String s) {
        this.repository.delete(s);
        return false;
    }

    public Set<User> getAll() {
        return this.repository.getAll();
    }

    public Set<User> getAllUserStartWithM(){
        Set<User> userWithA = new HashSet<User>();
        Set<User> users = getAll();
        for (User user : users){
            if (user.getFirstName().trim().toLowerCase().startsWith("m")){
                userWithA.add(user);
            }
        }
        return userWithA;
    }
}
