/**
 * Mziyanda Mwanda
 * 215133765
 * Assignment 3
 * 11 June 2021
 * */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.User;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
@Test
    public void createUser(){
     User user = UserFactory.createUser("Mandisa", "Msongelwa");
    System.out.println(user);
}
}