package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Discount implements Initializable {
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private Button homeButton;
	@FXML
	private Button calcButton;
	@FXML
	private Button button0;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button buttonAC;
	@FXML
	private Button buttonequal;
	@FXML
	private Button del;
	@FXML
	private Label label;
	@FXML
	private Label label2;
	@FXML
	private Label label3;
	@FXML
	private Button buttondot;
	@FXML
	private Button buttonchoice;

	int n1 = 0;
	String symbol = "";
	float res = 0;
	int n2 = 0;
	String num1 = "";
	String num3 = "";
	String num2 = "";
	String choice = "";

	@FXML
	ChoiceBox<String> choicebox = new ChoiceBox<>();
	String[] disc = { "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85",
			"90", "95" };

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choicebox.getItems().addAll(disc);
		choicebox.setOnAction(this::dispfinal);
	}
	
	

	@FXML
	private void display0() {
		label.setText("0");
		num1 += "0";
		label();
	}

	@FXML
	private void display1() {
		label.setText("1");
		num1 += "1";
		label();
	}

	@FXML
	private void display2() {
		label.setText("2");
		num1 += "2";
		label();
	}

	@FXML
	private void display3() {
		label.setText("3");
		num1 += "3";
		label();
	}

	@FXML
	private void display4() {
		label.setText("4");
		num1 += "4";
		label();
	}

	@FXML
	private void display5() {
		label.setText("5");
		num1 += "5";
		label();
	}

	@FXML
	private void display6() {
		label.setText("6");
		num1 += "6";
		label();
	}

	@FXML
	private void display7() {
		label.setText("7");
		num1 += "7";
		label();
	}

	@FXML
	private void display8() {
		label.setText("8");
		num1 += "8";
		label();
	}

	@FXML
	private void display9() {
		label.setText("9");
		num1 += "9";
		label();
	}

	public void dispfinal(ActionEvent event)
	{
		String temp;
		choice = choicebox.getValue();
		float res = Float.parseFloat(num1) * (Float.parseFloat(choice)/100);
		float finalprice = Float.parseFloat(num1) - res;
		temp = String.format("%.2f", finalprice);
		label3.setText(temp);
	}

	@FXML
	private void displaydot() {
		label.setText(".");
	}

	@FXML
	private void displayAC() {
		label.setText("");
		num1 = "";
		label3.setText("");
	}
	
	@FXML
	private void label() {
		label.setText(num1);
	}
	
	@FXML
	private void del() {
		
		StringBuffer sb= new StringBuffer(num1); 
		sb.deleteCharAt(sb.length()-1); 
		label.setText(sb + "");
		num1 = sb.toString();
	}
    
	
	public void switchToScene1(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}