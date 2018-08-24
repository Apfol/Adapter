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
public abstract class Usuario {

    private String nombre;
    private String usuario;
    private String contraseña;
    
    public Usuario(String nombre, String usuario, String contraseña) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public void adicionar(Usuario usuario) {
        usuarios.add(usuario);
    };
    public void modificar(Usuario usuario, int posicion) {
        usuarios.remove(posicion);
        usuarios.add(usuario);
    };
    public void mostrarUsuarios() {
        usuarios.forEach((us) -> {
            System.out.println(us);
        });
    };
    abstract public void consultar();
    abstract public void eliminar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
}


