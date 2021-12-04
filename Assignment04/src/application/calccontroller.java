package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class calccontroller {

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
	private Button buttonplus;
	@FXML
	private Button buttonminus;
	@FXML
	private Button buttonmul;
	@FXML
	private Button buttondiv;
	@FXML
	private Button buttonequal;
	@FXML
	private Button buttonperc;
	@FXML
	private Label label;
	@FXML
	private Label label2;
	@FXML
	private Button buttondot;
	@FXML
	private Button del;

	int n1 = 0;
	String symbol = "";
	float res = 0;
	int n2 = 0;
	String num1 = "";
	String num2 = "";

	@FXML
	private void display0() {
		label.setText("0");
		n1 = 0;
		num1 += "0";
		label();
	}

	@FXML
	private void display1() {
		label.setText("1");
		n1 = 1;
		num1 += "1";
		label();
	}

	@FXML
	private void display2() {
		label.setText("2");
		n1 = 2;
		num1 += "2";
		label();
	}

	@FXML
	private void display3() {
		label.setText("3");
		n1 = 3;
		num1 += "3";
		label();
	}

	@FXML
	private void display4() {
		label.setText("4");
		n1 = 4;
		num1 += "4";
		label();
	}

	@FXML
	private void display5() {
		label.setText("5");
		n1 = 5;
		num1 += "5";
		label();
	}

	@FXML
	private void display6() {
		label.setText("6");
		n1 = 6;
		num1 += "6";
		label();
	}

	@FXML
	private void display7() {
		label.setText("7");
		n1 = 7;
		num1 += "7";
		label();
	}

	@FXML
	private void display8() {
		label.setText("8");
		n1 = 8;
		num1 += "8";
		label();
	}

	@FXML
	private void display9() {
		label.setText("9");
		n1 = 9;
		num1 += "9";
		label();
	}

	@FXML
	private void displayplus() {
		label.setText("+");
		symbol = "+";
		num2 = num1;
		num1 = "";
		label();
	}

	@FXML
	private void displayminus() {
		label.setText("-");
		symbol = "-";
		num2 = num1;
		num1 = "";
		label();
	}

	@FXML
	private void displaymul() {
		label.setText("x");
		symbol = "x";
		num2 = num1;
		num1 = "";
		label();
	}

	@FXML
	private void displaydot() {
		label.setText(".");
		num1 += ".";
		label();
	}

	@FXML
	private void displayequal() {

		if (symbol.equals("+")) {
			res = Float.parseFloat(num1) + Float.parseFloat(num2);
			label.setText(String.valueOf(res));
			num1 = "";
			num2 = "";
		}
		if (symbol.equals("-")) {
			res = Float.parseFloat(num2) - Float.parseFloat(num1);
			label.setText(String.valueOf(res));
			num1 = "";
			num2 = "";
		}
		if (symbol.equals("/")) {
			res = Float.parseFloat(num2) / Float.parseFloat(num1);
			label.setText(String.valueOf(res));
			num1 = "";
			num2 = "";
		}
		if (symbol.equals("x")) {
			res = Float.parseFloat(num1) * Float.parseFloat(num2);
			label.setText(String.valueOf(res));
			num1 = "";
			num2 = "";
		}
		if (symbol.equals("%")) {
			res = Float.parseFloat(num2) * 100 / Float.parseFloat(num1);
			label.setText(String.valueOf(res));
			num1 = "";
			num2 = "";
		}
	}

	@FXML
	private void displaydiv() {
		label.setText("/");
		symbol = "/";
		num2 = num1;
		num1 = "";
		label();
	}

	@FXML
	private void displayperc() {
		label.setText("%");
		symbol = "%";
		num2 = num1;
		num1 = "";
		label();
	}

	@FXML
	private void displayAC() {
		label.setText("");
		label2.setText("");
		num1 = "";
		num2 = "";
		symbol = "";
	}

	@FXML
	private void label() {
		label2.setText(num2 + symbol + num1);
	}
	
	@FXML
	private void del() {
		
		if(symbol.equals("+"))
		{
			StringBuffer sb= new StringBuffer(symbol); 
			sb.deleteCharAt(sb.length()-1); 
			label.setText(sb + "");
			symbol = sb.toString();
			num1 = num2;
			num2 = "";
			label();
		}
		else if(symbol.equals("-"))
		{
			StringBuffer sb= new StringBuffer(symbol); 
			sb.deleteCharAt(sb.length()-1);  
			label.setText(sb + "");
			symbol = sb.toString();
			num1 = num2;
			num2 = "";
			label();
		}
		else if(symbol.equals("x"))
		{
			StringBuffer sb= new StringBuffer(symbol); 
			sb.deleteCharAt(sb.length()-1);  
			label.setText(sb + "");
			symbol = sb.toString();
			num1 = num2;
			num2 = "";
			label();
		}
		else if(symbol.equals("/"))
		{
			StringBuffer sb= new StringBuffer(symbol); 
			sb.deleteCharAt(sb.length()-1); 
			label.setText(sb + "");
			symbol = sb.toString();
			num1 = num2;
			num2 = "";
			label();
		}
		else if(symbol.equals("%"))
		{
			StringBuffer sb= new StringBuffer(symbol); 
			sb.deleteCharAt(sb.length()-1); 
			label.setText(sb + "");
			symbol = sb.toString();
			num1 = num2;
			num2 = "";
			label();
		}
		else
		{
			StringBuffer sb= new StringBuffer(num1); 
			sb.deleteCharAt(sb.length()-1); 
			label.setText(sb + "");
			num1 = sb.toString();
			label();
		}
		
	}
	
	public void switchToScene1(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToScene2(MouseEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToScene5(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("money.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	


}
