package za.ac.cput.Factory;
/* Assignment3
 *FactoryTest for Address
 * Author: Zintle Zothe (216130565)
 *Date: 10 June 2021
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Address;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    public void createAddress(){
        Address address= AddressFactory.createAddress("34","Shiyeka Makhaza","1784");

        System.out.println(address);

        assertNotNull(address);
    }



    @Test//test for timeout
    @Timeout(5)
    public void timeOutTest(){
        System.out.println("timeout test passed");
    }


}