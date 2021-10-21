package za.ac.cput.Factory;
/* Assignment3
 *FactoryTest for Contact
 * Author: Zintle Zothe (216130565)
 *Date: 10 June 2021
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Contact;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {

    @Test
    public void createContact(){
        Contact contact= ContactFactory.createContact("0123456789","zo32@gmail.com");

        System.out.println(contact);

        assertNotNull(contact);
    }



    @Test//test for timeout
    @Timeout(5)
    public void timeOutTest2() throws InterruptedException{
        TimeUnit.SECONDS.sleep(4);
        System.out.println("buffering......");
    }


}