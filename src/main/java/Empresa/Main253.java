package Empresa;

public class Main253 {

    public static void main(String[] args) {
        Usuario253 empleado1 = new Usuario253("Cesar Jaramillo", "cesarjara@gmail.com", "Empleado");
        Usuario253 empleado2 = new Usuario253("Sebastian Salazar", "salasebas@gmail.com", "Empleado");
        Usuario253 empleado3 = new Usuario253("Sara Carvajal", "saracarva@gmail.com", "Empleado");

        Usuario253 supervisor1 = new Usuario253("Daniel Castro", "castroDan@gmail.com", "Supervisor");

        Usuario253 administrador = new Usuario253("Sofia Builes", "sofibuiles@gmail.com", "Administrador");

        empleado1.mostrarDetalles();
        empleado2.mostrarDetalles();
        empleado3.mostrarDetalles();
        supervisor1.mostrarDetalles();
        administrador.mostrarDetalles();
        

    }





}
