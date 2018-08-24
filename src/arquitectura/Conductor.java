/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

/**
 *
 * @author Andrés
 */
public class Conductor extends Usuario{

    @Override
    public void consultar() {
        System.out.println("Se ha consultado conductor");
    }

    @Override
    public void eliminar() {
        System.out.println("Se ha eliminado conductor");
    }

    @Override
    public String toString() {
        return "Conductor"; //To change body of generated methods, choose Tools | Templates.
    }
   
}
