/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés
 */
public class Pasajero extends Usuario {

    public Pasajero(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña);
    }

    public Pasajero() {
    }

    @Override
    public void consultar() {
        String datosUsuarios = "";
        ArrayList<Usuario> usuarios = this.getUsuarios();
        for (Usuario us: usuarios) {
            if(us instanceof Pasajero) {
                datosUsuarios += us.getNombre() + " " + us.getCorreo() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, datosUsuarios);
    }

    @Override
    public void eliminar(String correo) {
        ArrayList<Usuario> usuarios = this.getUsuarios();
        for (Usuario us : usuarios) {
            if (us.getCorreo().equals(correo)) {
                usuarios.remove(us);
            }
        }
    }

    @Override
    public String toString() {
        return "Pasajero"; //To change body of generated methods, choose Tools | Templates.
    }

}
