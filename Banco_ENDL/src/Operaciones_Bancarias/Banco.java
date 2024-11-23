package Operaciones_Bancarias;

import enums.Rol;
import menus.Login;
import menus.MenuCliente;
import menus.MenuEjecutivo;
import menus.MenuGerente;
import tarjetas.Debito;
import tarjetas.Tarjeta;
import usuarios.Gerente;

import java.awt.*;
import java.util.ArrayList;

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


    //-------------------------VALLIDACIONES-----------------------------

    public Tarjeta validarNumeroTarjetaDebito(double tarjetaDebito) {
        for (Debito debito : tarjetasDebito) {
            if (debito.getNumeroTarjeta().equals(tarjetaDebito)) {
                return debito;
            }
        }
        return null;
    }

    public void validarNumeroTarjetaCredito(Tarjeta tarjetaCredito) {
    }
}
