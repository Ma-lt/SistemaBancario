package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Date;

public class ControllerTransacciones {
    public TextField cuentaText;
    public DatePicker fechaDatePicker;
    public ChoiceBox tipoBox;

    public void generarTransacciones(ActionEvent actionEvent) { //genera aleatoriamente las transacciones
        int numeroCuenta = Integer.parseInt(cuentaText.getText());
    }

    public void consultarMovimientos(ActionEvent actionEvent) {
        int numeroCuenta = Integer.parseInt(cuentaText.getText());
        String tipo = tipoBox.getValue().toString();
        LocalDate fecha = fechaDatePicker.getValue();
        System.out.println(fecha);
    }
}
