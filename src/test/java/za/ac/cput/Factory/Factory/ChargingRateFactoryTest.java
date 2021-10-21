package za.ac.cput.Factory;

// Author: Panashe Muinzani_218186568
// Date: 9 June 2021


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ChargingRateFactoryTest {
    private ChargingRateFactory moduleCode;
    private ChargingRateFactory Rate;
    private ChargingRateFactory ADP;
    private ChargingRateFactory R50;


    @BeforeEach
    void setUp() {
        moduleCode = new ChargingRateFactory();
        Rate = new ChargingRateFactory();
        moduleCode = ADP;
        Rate = R50;
    }

    @Test
    void testIdentity() {
        assertSame(Rate,R50);
    }


    @Test
    void testEquality() {
        assertEquals(moduleCode,ADP);

    }
    @Test
    @Disabled("Unavailable until futher notice")
    void testDisable() {
        assertSame(moduleCode, ADP);
    }

}