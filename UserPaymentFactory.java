/**
 * Mziyanda Mwanda
 * 215133765
 * Assignment 3
 * 11 June 2021
 * */
package za.ac.cput.Factory;

import za.ac.cput.Entity.UserPayment;
import za.ac.cput.Util.GenUserId;

public class UserPaymentFactory {
    public static UserPayment createUserPayment(String paymentId) {
        String userId = GenUserId.genUserId();
        //tring paymentId = GenUserId.genUserId();
        UserPayment user = new UserPayment.Builder()
                .setUserId(userId)
                .setPaymentId()
                .build();
        return user;
    }
}
