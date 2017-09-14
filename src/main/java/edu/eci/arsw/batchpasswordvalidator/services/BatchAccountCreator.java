/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.services;

import com.google.inject.Inject;
import edu.eci.arsw.batchpasswordvalidator.model.AccountRequest;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Scope;

/**
 *
 * @author hcadavid
 */

public class BatchAccountCreator {
    //DefaultPasswordValidator pw=new DefaultPasswordValidator();

    @Inject            
    Contraseña u;
    @Inject
    ISO3892PasswordValidator ui;
    
    
    public List createAccounts(List<AccountRequest> requests){
        
        List<AccountRequest> failedRequests=new LinkedList<>();
        
        for (AccountRequest ar:requests){
            if (ui.checkPassword(ar.getPassword())){
                registerAccount(ar);
            }
            else{
                failedRequests.add(ar);
            }
        }
        
        return failedRequests;
                
    }
    
    private void registerAccount(AccountRequest ar){
        System.out.println("*** Creating account for:"+ar.getUserName());
    }
    
    private static final Logger LOG = Logger.getLogger(BatchAccountCreator.class.getName());
    
}
