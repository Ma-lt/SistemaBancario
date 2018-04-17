package interfaz;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import logica.Transaccion;

import java.time.LocalDate;
import java.util.Random;

public class ControllerTransacciones {
    public TextField cuentaText;
    public DatePicker fechaDatePicker;

    public void generarTransacciones(ActionEvent actionEvent) { //genera aleatoriamente las transacciones
        int numeroCuenta = Integer.parseInt(cuentaText.getText());
        Transaccion transaccion;
        Random generadorAleatorios = new Random();
        int numeroDeTransacciones = 1+generadorAleatorios.nextInt(10);
        System.out.println(10000+numeroDeTransacciones);

        for(int i=1; i<= numeroDeTransacciones; i++){
            int tipoTransaccion = generadorAleatorios.nextInt(6);
            switch (tipoTransaccion){
                case 0:
                    System.out.println("Retiro");
                    break;
                case 1:
                    System.out.println("Deposito");
                    break;
                case 2:
                    System.out.println("Pago Intereses");
                    break;
                case 3:
                    System.out.println("Cobro Comision");
                    break;
                case 4:
                    System.out.println("Compra en comercio");
                    break;
                case 5:
                    System.out.println("Retiro en cajero automatico");
                    break;

            }

        }
        
    }

    public void consultarMovimientos(ActionEvent actionEvent) {
        int numeroCuenta = Integer.parseInt(cuentaText.getText());
        LocalDate fecha = fechaDatePicker.getValue();
    }
}
