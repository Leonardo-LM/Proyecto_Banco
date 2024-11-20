package usuarios;

import enums.Rol;

import javax.management.relation.Role;
import java.time.LocalDate;

public class Empleado {
    public String nombre;
    public String apellido;
    public String RFC;
    private String CURP;
    public String email;
    public String sucursal;
    private double salario;
    public Role rol;

    public Empleado(String nombre, String apellido, String RFC, String CURP, String email, String sucursal, double salario, Role rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.RFC = RFC;
        this.CURP = CURP;
        this.email = email;
        this.sucursal = sucursal;
        this.salario = salario;
        this.rol = rol;
    }
}
