package tarjetas;

<<<<<<< HEAD
public class Debito extends Tarjeta{
    public Debito() {
        super();
    }
=======
import tarjetas.Tarjeta;

import java.time.LocalDate;

public class Debito extends Tarjeta {

    public Debito(String titular, String numeroTarjeta, String fechaCreacion, double saldo, int cvv, String clabeInter, LocalDate fechaVencimiento, String ultimoMovimiento) {
        super(titular, numeroTarjeta, fechaCreacion, saldo, cvv, clabeInter, fechaVencimiento, ultimoMovimiento);
    }

    //----------------------------GETTER & SETTER---------------------------------------

>>>>>>> 583a7ceb6070bfd8b5b4e6ccc8fd34bbcd05ef68
}
