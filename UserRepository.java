package za.ac.cput.Repository;

import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements UserRepositoryInt {


    private Set<User> userDB;

    public UserRepository(){
        this.userDB = new HashSet<>();
    }


    public User create(String firstName, String lastName) {
        User user = UserFactory.createUser(firstName,lastName);
        this.userDB.add(user);
        return user;
    }

    @Override
    public User create(User user) {
        return this.create(user.getFirstName(), user.getLastName());
    }

    public User read(String userId){
        User user = null;
        for (User u:userDB){
            if (u.getUserId().equalsIgnoreCase(userId)){
                user= u;
                break;
            }
        }
        return user;
    }
    public User update(User user){
        User oldUser = read(user.getUserId());

        if (oldUser != null){
            userDB.remove(oldUser);
            userDB.add(user);
        }
        return user;
    }
    public void delete(String userId){
        User user = read(userId);

        if (userId != null){
            this.userDB.remove(user);
        }
    }

    public Set<User>getAll(){
        return userDB;
    }


}
