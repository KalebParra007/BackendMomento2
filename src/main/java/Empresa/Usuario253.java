package Empresa;

import java.lang.module.ModuleDescriptor;

public class Usuario253 {

    //Atributos
    String nombreUsuario, emailUsuario, rolUsuario;


    //Metodos

    public Usuario253(String nombreUsuario, String emailUsuario, String rolUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.rolUsuario = rolUsuario;
    }

    public void ingresarDatosUsuario(String nombreUsuario, String emailUsuario, String rolUsuario){
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.rolUsuario = rolUsuario;
    }

    public void mostrarDetalles(){
        System.out.println("nombre: "+nombreUsuario);
        System.out.println("email: "+emailUsuario);
        System.out.println("rol: "+rolUsuario);
    }

}
