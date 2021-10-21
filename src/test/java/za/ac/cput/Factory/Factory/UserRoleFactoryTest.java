package za.ac.cput.Factory;

/* Role.java
   TestFactory for userRole
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.UserRole;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class UserRoleFactoryTest {
    private UserRole userRole1;
    private UserRole userRole2;
    private UserRole userRole3;

    @BeforeEach
    void setUp() {
        userRole1 = new UserRole("4256","6582");
        userRole2 = new UserRole("5812","6564");
        userRole3 = userRole1;
    }

    @Test
    public void userRole(){
        UserRole userRole = UserRoleFactory.createUserRole();
        System.out.println(userRole);
    }

    @Test
    void testEquality() {

        assertEquals(userRole1,userRole3);
    }

    @Test
    void testIdentity() {

        assertNotSame(userRole1,userRole2);
    }

   @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void timeout() {
        assertNotEquals(userRole1,userRole2);
        assertNotSame(userRole1,userRole2);
    }
    @Disabled
    @Test
    void disableTest(){
        assertNotEquals(userRole1,userRole2);
    }

}