/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.test;

import edu.eci.arsw.batchpasswordvalidator.services.ISO3892PasswordValidator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Diseño de pruebas:
 * 
 * Clases de equivalencia:
 *  
 *      CE1: Si la contraseña tiene mas de 10 caracteres o contiene algun 
 *          caracter especial.
 *           Resultado esperado: True
 *          
 *      CE2: Si la contraseña tiene menos o igual a 10 caracteres y contiene algun 
 *          caracter especial.
 *           Resultado esperado: True 
 * 
 *      CE3:Si contiene menos de 11 caracteres y no tiene ningun caracter especial.
 *           Resultado esperado: False
 * 
 *      CE4:Si contiene menos de 11 caracteres.
 *            Resultado esperado: False 
 * 
 *  
 * Condiciones de frontera:
 * 
 *      CF1: Cuando la contraseña tiene 11 caracteres y tambien alguno de los caracteres especiales.
 *           Clases de equivalencia relacionadas:CE1
 *           Resultado esperado: True
 * 
 * 
 *      CF2: Cuando la contraseña tiene mas 10 caracteres  y alguno de los caracteres especiales.
 *           Clases de equivalencia relacionadas:CE2
 *           Resultado esperado: True
 * 
 *      CF3: Cuando tiene menos a 11 caracteres y no tiene ningun caracter especial.
 *           Clases de equivalencia relacionadas:CE3 YCE1.
 *           Resultado esperado: False
 * 
 *      CF4: Cuando tiene menos o igual a de 10 caracteres especiales.
 *           Clases de equivalencia relacionadas:EC4
 *           Resultado esperado: Si es numérico, False
 * 
 * 
 * 
 */
public class ISO3892PasswordValidatorTest {
    
    public ISO3892PasswordValidatorTest() {
    }
    
    @Test
    public void ClasesEquivalentEC1() {
        ISO3892PasswordValidator dpv1=new ISO3892PasswordValidator();
        assertTrue("Se aceptan contraseñas con mas de 10 caracteres o que contenga algun caracter especial.",dpv1.checkPassword("1234567891@"));
        assertTrue("Se aceptan contraseñas con mas de 10 caracteres o que contenga algun caracter especial.",dpv1.checkPassword("12345678915"));                
    }
    @Test
    public void ClasesEquivalentEC2() {
        ISO3892PasswordValidator dpv2=new ISO3892PasswordValidator();
        assertTrue("Se aceptan contraseñas con mas de 10 caracteres y que contenga algun caracter especial.",dpv2.checkPassword("1234567890@"));
        assertTrue("Se aceptan contraseñas con mas de 10 caracteres y que contenga algun caracter especial.",dpv2.checkPassword("12345675468915@"));        
    }
    
    @Test
    public void ClasesEquivalentEC3() {
        ISO3892PasswordValidator dpv3=new ISO3892PasswordValidator();
        assertFalse("No se aceptan contraseñas con mas de 10 caracteres y que no contenga algun caracter especial.",dpv3.checkPassword("12341"));

    }    
   
    @Test
    public void ClasesEquivalentEC4() {
        ISO3892PasswordValidator dpv4=new ISO3892PasswordValidator();
        assertFalse("NO se aceptan contraseñas con menos de 10 caracteres .",dpv4.checkPassword("1234"));

    }    
}
