package application;

import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controller3 {
	@FXML
	private Button idAtras2;
	@FXML
	private Button idVolverInicio;

	// Event Listener on Button[#idAtras2].onMouseClicked
	@FXML
	public void ClicAtras2(MouseEvent event) throws IOException {
		// TODO Autogenerated
	AbrirVentanaSecundaria vs = new AbrirVentanaSecundaria();
	vs.show((Stage) idAtras2.getScene().getWindow());
		
	}
	// Event Listener on Button[#idVolverInicio].onMouseClicked
	@FXML
	public void clicVolverInicio(MouseEvent event) throws IOException {
		// TODO Autogenerated
		AbrirVentanaPrimaria vp = new AbrirVentanaPrimaria();
		vp.show((Stage) idVolverInicio.getScene().getWindow());
				
		
	}
}
