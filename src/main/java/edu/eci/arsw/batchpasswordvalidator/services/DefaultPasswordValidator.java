/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.services;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author hcadavid
 */
public class DefaultPasswordValidator implements Contraseña{
    
    /**
     * Valida los siguientes criterios de contrasena:
     * - La contrasena no debe tener mas de 20 caracteres, ni contener los
     * caracteres especiales: !@#$%ˆ*()-+
     * @param pwd la contrasena asociada
     * @return True si cumple con los criterios indicados
     */
    @Override
    public boolean checkPassword(String  password){
        if (password.length()<=20){            
            return !StringUtils.containsAny(password, "!@#$%ˆ*()-+");
        }
        else{
            return false;
        }
    }    

   

}
