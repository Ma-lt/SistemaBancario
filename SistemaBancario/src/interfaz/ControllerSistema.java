package interfaz;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ControllerSistema {

    @FXML
    private BorderPane ventanaPrincipal;

    @FXML
    public void crearClienteUI(MouseEvent mouseEvent) {
        loadUI("cliente");
    }
    @FXML
    public void crearCuentaUI(MouseEvent mouseEvent) {
        loadUI("cuenta");
    }
    @FXML
    public void transaccionesUI(MouseEvent mouseEvent) {
        loadUI("transaccion");
    }
    @FXML
    public void movimientosUI(MouseEvent mouseEvent) {
        loadUI("movimientos");
    }

    public void loadUI(String ui){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(ui + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ventanaPrincipal.setCenter(root);
    }
}
