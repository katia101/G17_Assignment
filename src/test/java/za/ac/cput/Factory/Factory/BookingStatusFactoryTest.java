package za.ac.cput.Factory;


// Author: Panashe Muinzani_218186568
// Date: 9 June 2021

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BookingStatusFactoryTest {

    private BookingStatusFactoryTest Confirm;
    private BookingStatusFactoryTest Reject;
    private BookingStatusFactoryTest Available;
    private BookingStatusFactoryTest Unavailable;


    @BeforeEach
    void setUp() {
        Confirm = new BookingStatusFactoryTest();
        Reject = new BookingStatusFactoryTest();
        Confirm = Available;
        Reject = Unavailable;
    }

    @Test
    void testIdentity() {
        assertSame(Confirm,Available);
    }


    @Test
    void testEquality() {
        assertEquals(Reject,Unavailable);

    }

    @Test
    @Disabled("Unavailable until futher notice")
    void testDisable() {
        assertSame(Confirm, Available);
    }

}


