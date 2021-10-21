package za.ac.cput.Factory;
/**
 * Mziyanda Mwanda
 * 215133765
 * ADP3
 * Cap stone
 * */
import za.ac.cput.Entity.User;
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
