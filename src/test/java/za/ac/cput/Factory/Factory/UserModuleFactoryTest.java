package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.UserModule;

import static org.junit.jupiter.api.Assertions.*;

class UserModuleFactoryTest {
    UserModule userModule;

    @BeforeEach
    void setUp(){
        userModule = UserModuleFactory.createUserModule(23, "ADF2");
    }
    @Test
    void testExist(){
        assertNotNull(userModule);
    }
    @Test
    void testSame(){
        assertSame(userModule.getModuleCode(),"ADF2");
    }
}
