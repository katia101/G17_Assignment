package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.UserPayment;
import za.ac.cput.Factory.UserPaymentFactory;
import za.ac.cput.Service.UserPaymentServices;

import java.util.Set;

public class UserPaymentControl {
    @Autowired
    private UserPaymentServices userPaymentServices;
    @RequestMapping(value ="/create", method = RequestMethod.POST )
    public UserPayment create(@RequestBody UserPayment userPayment){
        UserPayment newUserPayment = UserPaymentFactory.createUserPayment(userPayment.getPaymentId());

        return userPaymentServices.create(newUserPayment);
    }
    @PostMapping("/delete")
    public String delete(@RequestBody UserPayment userPayment){
        if (userPaymentServices.delete(userPayment.getPaymentId()))
            return "Deleted";
        else
            return "Not deleted";
    }
    @RequestMapping("/update")
    public UserPayment update(@RequestBody UserPayment userPayment){
        UserPayment upUser = UserPaymentFactory.createUserPayment(userPayment.getPaymentId());
        return userPaymentServices.create(upUser);
    }

    @GetMapping("/read")
    public UserPayment read(@RequestBody UserPayment userPayment){
        return userPaymentServices.read(userPayment.getPaymentId());
    }
    @GetMapping("/getall")
    public Set<UserPayment> getAll(){
        return userPaymentServices.getAll();
    }
}
