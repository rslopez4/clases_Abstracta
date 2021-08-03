/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author niko_
 */
public class AnimalCarnivoro extends Animal {
    
    @Override
    public void alimentarse() {
        System.out.println("Los animales carnívoros comen carne");
        //throw new UnsupportedOperationException("Not supported yet.");
    }

   
    
}
