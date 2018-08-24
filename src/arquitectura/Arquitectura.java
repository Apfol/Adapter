/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés
 */
public class Arquitectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Seleccione la opción: \n"
                + "1. Crear usuario \n"
                + "2. Modificar usuario \n"
                + "3. Eliminar usuario \n"
                + "4. Consultar usuario \n"
                + "0. Salir"));
        switch (opcion) {
            case 1:
            int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1. Pasajero \n"
                    + "2. Conductor \n"
                    + "3. Administrador \n"));
                break;
            case 2:
            int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1. Pasajero \n"
                    + "2. Conductor \n"
                    + "3. Administrador \n"));
                break;
            case 3:
            
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
        }
        
        Usuario conductor = new Conductor();
        Usuario pasajero = new Pasajero();
        Usuario administrador = new AdministradorAdapter();
        
        conductor.consultar();
        pasajero.consultar();
        administrador.consultar();
        
        conductor.adicionar(pasajero);
        administrador.adicionar(conductor);
        pasajero.adicionar(administrador);
        
        pasajero.mostrarUsuarios();

    }
    
}
