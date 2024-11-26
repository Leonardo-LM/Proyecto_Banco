package usuarios.empleados;

<<<<<<< HEAD
import utils.Rol;
=======
import javax.management.relation.Role;
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68

public class Empleado {
    public String nombre;
    public String apellido;
    public String RFC;
    private String CURP;
    public String email;
    public String sucursal;
    private double salario;
    public Rol rol;

    public Empleado(String nombre, String apellido, String RFC, String CURP, String email, String sucursal, double salario, Rol rol) {
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
