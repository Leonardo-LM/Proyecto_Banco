package Operaciones_Bancarias;

import usuarios.Usuario;
import usuarios.gerentes.Gerente;

import java.time.LocalDate;

public class Banco {
    public Gerente gerenteDefault;

    public Banco() {
        //this.gerenteDefault = new Gerente();
    }

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


        return RFC;
    }
    public Usuario validarInicioSesion(String idUser, String contrasena){

        return null;
    }
}
