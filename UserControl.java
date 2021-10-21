package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;
import za.ac.cput.Service.UserServices;

import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserServices userService;
    @RequestMapping(value ="/create", method = RequestMethod.POST )
    public User create(@RequestBody User user){
        User newUser = UserFactory.createUser(user.getFirstName(), user.getLastName());

        return userService.create(newUser);
    }
    @PostMapping("/delete")
    public String delete(@RequestBody User user){
        if (userService.delete(user.getUserId()))
            return "Deleted";
        else
            return "Not deleted";
    }
    @RequestMapping("/update")
    public User update(@RequestBody User user){
        User upUser = UserFactory.createUser(user.getFirstName(),user.getLastName());
        return userService.create(upUser);
    }

    @GetMapping("/read")
    public User read(@RequestBody User user){
        return userService.read(user.getUserId());
    }
    @GetMapping("/getall")
    public Set<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getallwithm")
    public Set<User> getAllWithm(){
        return userService.getAllUserStartWithM();
    }

}
