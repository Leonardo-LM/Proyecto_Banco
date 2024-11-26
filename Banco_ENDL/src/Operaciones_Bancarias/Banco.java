package Operaciones_Bancarias;

<<<<<<< HEAD
import usuarios.Usuario;
import usuarios.gerentes.Gerente;

import java.time.LocalDate;
=======
import menus.Login;
import menus.MenuCliente;
import menus.MenuEjecutivo;
import menus.MenuGerente;
import tarjetas.Debito;
import tarjetas.Tarjeta;
import usuarios.gerentes.Gerente;

import java.util.ArrayList;
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68

public class Banco {
    public Gerente gerenteDefault;
    public MenuCliente menuCliente = new MenuCliente();
    public MenuEjecutivo menuEjecutivo = new MenuEjecutivo();
    public MenuGerente menuGerente = new MenuGerente();
    public Login login = new Login();
    public ArrayList<Debito> tarjetasDebito = new ArrayList<>();

    public Banco() {
        //this.gerenteDefault = new Gerente();
    }

<<<<<<< HEAD
    //Metodos
    public String generarRFC(String nombre, String apellido, LocalDate fechaRegistro) {
        char letraIApellPaterno = apellido.charAt(0);
        boolean vocal = false;
        int i = 0;
        String cadena="";
        while(i < apellido.length() & !vocal){
            if((apellido.charAt(i) == 'a') ||
                    (apellido.charAt(i) == 'e')  ||
                    (apellido.charAt(i) == 'i') ||
                    (apellido.charAt(i) == 'o') ||
                    (apellido.charAt(i) == 'u')) {

                cadena +=apellido.charAt(i);
                vocal = true;

            }
            i++;
        }
=======

    //-------------------------VALLIDACIONES-----------------------------
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68

    public Tarjeta validarNumeroTarjetaDebito(double tarjetaDebito) {
        for (Debito debito : tarjetasDebito) {
            if (debito.getNumeroTarjeta().equals(tarjetaDebito)) {
                return debito;
            }
        }
        return null;
    }

<<<<<<< HEAD
        return RFC;
    }
    public Usuario validarInicioSesion(String idUser, String contrasena){

        return null;
=======
    public void validarNumeroTarjetaCredito(Tarjeta tarjetaCredito) {
>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68
    }
}
