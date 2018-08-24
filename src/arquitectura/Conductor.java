/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class Conductor extends Usuario{
    
    public Conductor(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña);
    }

    @Override
    public void consultar() {
        System.out.println("Se ha consultado conductor");
    }

    @Override
    public String toString() {
        return "Conductor"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String correo) {
        ArrayList<Usuario> usuarios = this.getUsuarios();
        for (Usuario us: usuarios) {
            if(us.getCorreo().equals(correo)) {
                usuarios.remove(us);
            }
        }
    }
   
}
