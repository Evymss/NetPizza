/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mayar
 */
@Named(value = "imagenBean")
@RequestScoped
public class ImagenBean {

    /**
     * Creates a new instance of ImagenBean
     */
    public ImagenBean() {
        
       
        
    }
    
    
    public String imageDync() {
        return "pizIn";
    }
    
}
