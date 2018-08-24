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
public class AdministradorAdapter extends Usuario {

    private Administrador administrador = new Administrador();

    @Override
    public void consultar() {
        this.administrador.brief();
    }

    @Override
    public void eliminar() {
        this.administrador.delete();
    }

    @Override
    public String toString() {
        return "Adaptador Administrador"; //To change body of generated methods, choose Tools | Templates.
    }

    
}
