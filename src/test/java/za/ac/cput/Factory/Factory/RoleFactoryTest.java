package za.ac.cput.Factory;

/* Role.java
   TestFactory for Role
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Role;
import za.ac.cput.Entity.UserRole;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {
    private Role Role1;
    private Role Role2;
    private Role Role3;

    @BeforeEach
    void setUp() {
        Role1 = new Role("4132", "Student");
        Role2 = new Role("6572","Tutor");
        Role3 = Role1;
    }

    @Test
    public void createRole(){
        Role role = RoleFactory.createRole("Student");
        System.out.println(role);
    }

    @Test
    void testEquality() {

        assertEquals(Role1,Role3);
    }

    @Test
    void testIdentity() {

        assertNotSame(Role1,Role2);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void timeout() {
        assertNotEquals(Role1,Role2);
        assertNotSame(Role1,Role2);
    }

    @Disabled
    @Test
    void disableTest(){

        assertNotEquals(Role1,Role2);
    }
}