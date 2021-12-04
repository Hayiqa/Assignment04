package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Investment
{
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private TextField myTextField;
	@FXML
	private TextField myTextField1;
	@FXML
	private TextField myTextField2;
	@FXML
	private Button myButton;
	@FXML
	private Label label1;
	
	@FXML
	private void displable() {

		float invest = Float.parseFloat(myTextField.getText());
		float rate = Float.parseFloat(myTextField1.getText());
		int year = Integer.parseInt(myTextField2.getText());
		
	    rate *= 0.01;
	    float Investment = (float) (invest * Math.pow((year), 1 + rate));
	    label1.setText(Float.toString(Investment));
		
	}
	
	public void switchToScene1(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("money.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}