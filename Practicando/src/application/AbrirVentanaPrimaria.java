package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AbrirVentanaPrimaria {
	
	public void show(Stage st) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("VentanaInicial.fxml"));
		Scene scene = new Scene(root);
		
		st.setScene(scene);
		st.show();
	}

}
