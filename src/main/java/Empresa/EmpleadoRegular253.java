package Empresa;

public class EmpleadoRegular253 {

    String tareasBasicas;
    String verDatos;

    public EmpleadoRegular253(String tareasBasicas, String verDatos) {
        this.tareasBasicas = tareasBasicas;
        this.verDatos = verDatos;
    }

    public String realizarTareasBasicas(){
        return "El empleado reaiza las tareas basicas asignadas";
    }

    public String verDatosEmpleado(){
        return "Los datos del empleado son: ";
    }
}
