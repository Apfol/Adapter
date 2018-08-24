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
public class Pasajero extends Usuario{

    
    public Pasajero(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña);
    }
    

    @Override
    public void consultar() {
        System.out.println("Se ha consultado pasajero");
    }

    @Override
    public void eliminar() {
        System.out.println("Se ha eliminado pasajero");
    }

    @Override
    public String toString() {
        return "Pasajero"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
