package Empresa;

public class Supervisor253 {

    String verDetallesEmpleados, supervisarTrabajo;

    public Supervisor253(String verDetallesEmpleados, String supervisarTrabajo) {
        this.verDetallesEmpleados = verDetallesEmpleados;
        this.supervisarTrabajo = supervisarTrabajo;
    }

    public String getVerDetallesEmpleados(){
        return "El supervisor puede ver la información de los empleados regulares";
    }

    public String getSupervisarTrabajo(){
        return "El supervisor puede supervizar el trabajo de los empleados";
    }

}
