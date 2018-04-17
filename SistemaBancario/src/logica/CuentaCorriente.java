package logica;

import java.time.LocalDate;

public class CuentaCorriente extends Cuenta{


    public CuentaCorriente(int id_Cliente, int numero_Cuenta, LocalDate fecha_Apertura, String moneda, Double saldo) {
        super(id_Cliente, numero_Cuenta, fecha_Apertura, moneda, saldo);
    }

    @Override
    public void cobroComision() {

    }
}
