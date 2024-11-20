package usuarios;

import java.time.LocalDate;

public class Cliente {
    public String nombre;
    public String apellido;
    public String RFC;
    private String CURP;
    public String email;
    public LocalDate fechaRegistro;
    public String sucursal;

    public Cliente(String nombre, String apellido, String RFC, String CURP, String email, LocalDate fechaRegistro, String sucursal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.RFC = RFC;
        this.CURP = CURP;
        this.email = email;
        this.fechaRegistro = LocalDate.now();
        this.sucursal = "GERMANS CUMS";
    }


}
