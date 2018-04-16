package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ControllerCliente {
    public Button confirmarButton;
    public TextField apellidosText;
    public TextField nameText;
    public TextField idText;
    public ChoiceBox tipoBox;
    public TextField saldoText;
    public ChoiceBox monedaBox;

    public void crearCliente(ActionEvent actionEvent) {
        String apellidos = apellidosText.getText();
        String nombre = nameText.getText();
        int idCliente = Integer.parseInt(idText.getText());

        System.out.println(idCliente + apellidos + nombre);
        //se crea el objeto y se guarda en la BD
    }

    public void crearCuenta(ActionEvent actionEvent) {
        int idCliente = Integer.parseInt(idText.getText());
        LocalDate fechaApertura = LocalDate.now();
        String moneda = monedaBox.getValue().toString();
        Double saldo = Double.parseDouble(saldoText.getText());
        String tipo = tipoBox.getValue().toString();
        System.out.println(idCliente + tipo + moneda + saldo + fechaApertura);
        //se llama el constructor de cuenta y se guarda en la BD
    }
}
