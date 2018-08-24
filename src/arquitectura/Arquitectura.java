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
        
        String nombre;
        String correo;
        String contraseña;
        
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
                    + "3. Administrador \n"
                    + "0. Regresar"));
            switch(opcion1) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Introducir nombre");
                    correo = JOptionPane.showInputDialog("Introducir correo");
                    contraseña = JOptionPane.showInputDialog("Introducir contraseña");
                    Usuario pasajero = new Pasajero(nombre, correo, contraseña);
                    pasajero.adicionar(pasajero);
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Introducir nombre");
                    correo = JOptionPane.showInputDialog("Introducir correo");
                    contraseña = JOptionPane.showInputDialog("Introducir contraseña");
                    Usuario conductor = new Conductor(nombre, correo, contraseña);
                    conductor.adicionar(conductor);
                    break;
                case 3:
                    nombre = JOptionPane.showInputDialog("Introducir nombre");
                    correo = JOptionPane.showInputDialog("Introducir correo");
                    contraseña = JOptionPane.showInputDialog("Introducir contraseña");
                    Usuario administrador = new AdministradorAdapter(nombre, correo, contraseña);
                    administrador.adicionar(administrador);
                    break;
                case 4:
                    break;    
            }
                break;
            case 2:
            int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1. Pasajero \n"
                    + "2. Conductor \n"
                    + "3. Administrador \n"
                    + "0. Regresar"));
            switch(opcion2) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;    
            }
                break;
            case 3:
            int opcion3 = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1. Pasajero \n"
                    + "2. Conductor \n"
                    + "3. Administrador \n"
                    + "0. Regresar"));
            switch(opcion3) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                    
            }
                break;
            case 4:
            int opcion4 = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1. Pasajero \n"
                    + "2. Conductor \n"
                    + "3. Administrador \n"
                    + "0. Regresar"));
            switch(opcion4) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;    
            }
                break;
            case 0:
                
                break;
        }

    }
    
}
