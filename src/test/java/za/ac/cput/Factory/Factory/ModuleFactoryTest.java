package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Module;

import static org.junit.jupiter.api.Assertions.*;

class ModuleFactoryTest {
    Module module;

    @BeforeEach
    void setUp(){
        module  = ModuleFactory.createModule("ADF2", "Applicaton Development", 2);
    }
    @Test
    void testExist(){
        assertNotNull(module);
    }
    @Test
    void testSame(){
        assertSame(module.getModuleCode(),"ADF2");
    }
}