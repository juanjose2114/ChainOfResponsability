package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InicioController {

    @FXML
    private TextField txtPresupuesto;

    @FXML
    private TextArea txtResultado;

    @FXML
    public void aprobarPresupuesto() {

        try {

            int presupuesto = Integer.parseInt(txtPresupuesto.getText());

            Ejecutivo ejecutivo = new Ejecutivo();
            Gerente gerente = new Gerente();
            Vicepresidente vicepresidente = new Vicepresidente();
            Presidente presidente = new Presidente();

            ejecutivo.setSiguiente(gerente);
            gerente.setSiguiente(vicepresidente);
            vicepresidente.setSiguiente(presidente);

            String resultado = ejecutivo.aprobar(presupuesto);

            txtResultado.setText(resultado);

        } catch (NumberFormatException e) {
            txtResultado.setText("Ingrese un número válido");
        }
    }
}
