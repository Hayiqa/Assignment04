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

public class BMI {

	@FXML
	private Label myLabel = new Label();
	@FXML
	private Label myLabel1 = new Label();
	@FXML
	private Label myLabel2 = new Label();
	@FXML
	private Label myLabel3 = new Label();
	@FXML
	private TextField myTextField;
	@FXML
	private TextField myTextField1;
	@FXML
	private Button myButton;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private void displable() {

		myLabel.setText("");
		myLabel2.setText("");
		myLabel1.setText("");
		myLabel3.setText("");

		float weight = Float.parseFloat(myTextField.getText());
		float height = Float.parseFloat(myTextField1.getText());

		float bmi = 0;
		String temp = "";
		bmi = weight / (height * height);
		temp = Float.toString(bmi);
		temp = String.format("%.1f", bmi);
		myLabel.setText(temp);

		if (bmi > 16.0 && bmi < 18.5 || bmi < 16.0) {
			myLabel2.setText("Underweight");
		}
		if (bmi < 25.0 && bmi > 18.5) {
			myLabel1.setText("Normal");
		}
		if (bmi > 25.0) {
			myLabel3.setText("Overweight");
		}

	}

	public void switchToScene1(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}