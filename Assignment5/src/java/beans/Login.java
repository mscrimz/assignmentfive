/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author c0687799
 */
@Named(value = "login")
@SessionScoped

public class Login implements Serializable {

    /**
     * Creates a new instance of Login
     */
    public Login() {
    }
    
}
