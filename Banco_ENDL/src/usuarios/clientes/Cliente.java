package usuarios.clientes;

<<<<<<< HEAD
import utils.Rol;

import java.time.LocalDate;
=======
import tarjetas.Tarjeta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68

public class Cliente {
    public String nombre;
    public String apellido;
    public String RFC;
    private String CURP;
    public String email;
    public LocalDate fechaRegistro;
    public String sucursal;
<<<<<<< HEAD
    public Rol rol;


    public Cliente(String nombre, String apellido, String RFC, String CURP, String email, LocalDate fechaRegistro, String sucursal) {
=======
    public double saldo;
    ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    Random rand = new Random();

    public Cliente(String nombre, String apellido, String RFC, String CURP, String email, LocalDate fechaRegistro, String sucursal, double saldo, ArrayList<Tarjeta> tarjetas) {
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68
        this.nombre = nombre;
        this.apellido = apellido;
        this.RFC = RFC;
        this.CURP = CURP;
        this.email = email;
<<<<<<< HEAD
        this.fechaRegistro = LocalDate.now();
        this.sucursal = "GERMANS CUMS";
        this.rol = Rol.CLIENTE;
    }


=======
        this.fechaRegistro = fechaRegistro;
        this.sucursal = sucursal;
        this.saldo = saldo;
        this.tarjetas = tarjetas;
    }

    public void generarTarjetaDebito() {
        int digitos1 = rand.nextInt(9);
        int digitos2 = rand.nextInt(9);
        int digitos3 = rand.nextInt(9);
        int digitos4 = rand.nextInt(9);

        System.out.println(String.format("%d %d %d %d", digitos1, digitos2, digitos3, digitos4));
    }


    public void generarTarjetaCredito() {
    }

    //-------------------------SETTER & GETTER-----------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68
}
