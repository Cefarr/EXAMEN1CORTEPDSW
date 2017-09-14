/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.test;

import edu.eci.arsw.batchpasswordvalidator.services.DefaultPasswordValidator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class DefaultPasswordValidatorTest {
    
    public DefaultPasswordValidatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testBTOne(){
        DefaultPasswordValidator dpv=new DefaultPasswordValidator();
        assertTrue("No se estan aceptando contrasenas validas de exactamente 20 caracteres.",dpv.checkPassword("12345678901234567890"));
    }


    @Test
    public void test(){
        DefaultPasswordValidator dpv=new DefaultPasswordValidator();
        assertFalse("Se estan aceptando contrasenas de exactamente 20 caracteres con simbolos invalidos.",dpv.checkPassword("1234!67890@234567890"));
    }

    
}
