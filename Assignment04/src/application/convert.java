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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class convert implements Initializable
{
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private Button convert;
	@FXML
	private TextField text;
	@FXML
	private Label label1;
	@FXML
	private Label label2;
	
	@FXML
	ChoiceBox<String> choicebox = new ChoiceBox<>();
	String[] currency = { "US Dollar", "Euro", "Pakistani Rupees", "Pounds", "Yen", "Indian Rupees" };
	
	@FXML
	ChoiceBox<String> choicebox1 = new ChoiceBox<>();
	String[] currency1 = { "US Dollar", "Euro", "Pakistani Rupees", "Pounds", "Yen", "Indian Rupees" };
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choicebox.getItems().addAll(currency);
		choicebox1.getItems().addAll(currency);
	}
	
	
	public void dispfinal(ActionEvent event)
	{
		String c1 = choicebox.getValue();
		String c2 = choicebox1.getValue();
		float rupee;
		float curr = Float.parseFloat(text.getText());
		
		if(c1.equals("US Dollar") && c2.equals("US Dollar"))
		{
			label1.setText(Float.toString(curr));
			label2.setText("USD");
		}
		if(c1.equals("US Dollar") && c2.equals("Euro"))
		{
			rupee = (float) (curr * 0.88);
			label1.setText(Float.toString(rupee));
			label2.setText("EURO");
		}
		if(c1.equals("US Dollar") && c2.equals("Pakistani Rupees"))
		{
			rupee = (float) (curr * 176.00);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		if(c1.equals("US Dollar") && c2.equals("Pounds"))
		{
			rupee = (float) (curr * 0.75);
			label1.setText(Float.toString(rupee));
			label2.setText("POUNDS");
		}
		if(c1.equals("US Dollar") && c2.equals("Yen"))
		{
			rupee = (float) (curr * 112.87);
			label1.setText(Float.toString(rupee));
			label2.setText("YEN");
		}
		if(c1.equals("US Dollar") && c2.equals("Indian Rupees"))
		{
			rupee = (float) (curr * 74.96);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		//--------------------------------------------------------
		if(c1.equals("Euro") && c2.equals("US Dollar"))
		{
			rupee = (float) (curr * 1.13);
			label1.setText(Float.toString(rupee));
			label2.setText("USD");
		}
		if(c1.equals("Euro") && c2.equals("Euro"))
		{
			label1.setText(Float.toString(curr));
			label2.setText("EURO");
		}
		if(c1.equals("Euro") && c2.equals("Pakistani Rupees"))
		{
			rupee = (float) (curr * 199.58);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		if(c1.equals("Euro") && c2.equals("Pounds"))
		{
			rupee = (float) (curr * 0.85);
			label1.setText(Float.toString(rupee));
			label2.setText("POUNDS");
		}
		if(c1.equals("Euro") && c2.equals("Yen"))
		{
			rupee = (float) (curr * 128.07);
			label1.setText(Float.toString(rupee));
			label2.setText("YEN");
		}
		if(c1.equals("Euro") && c2.equals("Indian Rupees"))
		{
			rupee = (float) (curr * 84.98);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		//------------------------------------------------------------
		if(c1.equals("Pakistani Rupees") && c2.equals("US Dollar"))
		{
			rupee = (float) (curr * 0.0057);
			label1.setText(Float.toString(rupee));
			label2.setText("USD");
		}
		if(c1.equals("Pakistani Rupees") && c2.equals("Euro"))
		{
			rupee = (float) (curr * 0.0050);
			label1.setText(Float.toString(rupee));
			label2.setText("EURO");
		}
		if(c1.equals("Pakistani Rupees") && c2.equals("Pakistani Rupees"))
		{
			label1.setText(Float.toString(curr));
			label2.setText("RUPEES");
		}
		if(c1.equals("Pakistani Rupees") && c2.equals("Pounds"))
		{
			rupee = (float) (curr * 0.0043);
			label1.setText(Float.toString(rupee));
			label2.setText("POUNDS");
		}
		if(c1.equals("Pakistani Rupees") && c2.equals("Yen"))
		{
			rupee = (float) (curr * 0.64);
			label1.setText(Float.toString(rupee));
			label2.setText("YEN");
		}
		if(c1.equals("Pakistani Rupees") && c2.equals("Indian Rupees"))
		{
			rupee = (float) (curr * 0.43);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		//------------------------------------------------------------
		if(c1.equals("Pounds") && c2.equals("US Dollar"))
		{
			rupee = (float) (curr * 1.33);
			label1.setText(Float.toString(rupee));
			label2.setText("USD");
		}
		if(c1.equals("Pounds") && c2.equals("Euro"))
		{
			rupee = (float) (curr * 1.17);
			label1.setText(Float.toString(rupee));
			label2.setText("EURO");
		}
		if(c1.equals("Pounds") && c2.equals("Pakistani Rupees"))
		{
			rupee = (float) (curr * 234.42);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		if(c1.equals("Pounds") && c2.equals("Pounds"))
		{
			label1.setText(Float.toString(curr));
			label2.setText("POUNDS");
		}
		if(c1.equals("Pounds") && c2.equals("Yen"))
		{
			rupee = (float) (curr * 150.34);
			label1.setText(Float.toString(rupee));
			label2.setText("YEN");
		}
		if(c1.equals("Pounds") && c2.equals("Indian Rupees"))
		{
			rupee = (float) (curr * 99.82);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		//----------------------------------------------------
		if(c1.equals("Yen") && c2.equals("US Dollar"))
		{
			rupee = (float) (curr * 0.0089);
			label1.setText(Float.toString(rupee));
			label2.setText("USD");
		}
		if(c1.equals("Yen") && c2.equals("Euro"))
		{
			rupee = (float) (curr * 0.0078);
			label1.setText(Float.toString(rupee));
			label2.setText("EURO");
		}
		if(c1.equals("Yen") && c2.equals("Pakistani Rupees"))
		{
			rupee = (float) (curr * 1.56);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		if(c1.equals("Yen") && c2.equals("Pounds"))
		{
			rupee = (float) (curr * 0.0067);
			label1.setText(Float.toString(curr));
			label2.setText("POUNDS");
		}
		if(c1.equals("Yen") && c2.equals("Yen"))
		{
			label1.setText(Float.toString(curr));
			label2.setText("YEN");
		}
		if(c1.equals("Yen") && c2.equals("Indian Rupees"))
		{
			rupee = (float) (curr * 0.66);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		//------------------------------------------------------------------------
		if(c1.equals("Indian Rupees") && c2.equals("US Dollar"))
		{
			rupee = (float) (curr * 0.013);
			label1.setText(Float.toString(rupee));
			label2.setText("USD");
		}
		if(c1.equals("Indian Rupees") && c2.equals("Euro"))
		{
			rupee = (float) (curr * 0.012);
			label1.setText(Float.toString(rupee));
			label2.setText("EURO");
		}
		if(c1.equals("Indian Rupees") && c2.equals("Pakistani Rupees"))
		{
			rupee = (float) (curr * 2.35);
			label1.setText(Float.toString(rupee));
			label2.setText("RUPEES");
		}
		if(c1.equals("Indian Rupees") && c2.equals("Pounds"))
		{
			rupee = (float) (curr * 0.010);
			label1.setText(Float.toString(curr));
			label2.setText("POUNDS");
		}
		if(c1.equals("Indian Rupees") && c2.equals("Yen"))
		{
			rupee = (float) (curr * 1.51);
			label1.setText(Float.toString(curr));
			label2.setText("YEN");
		}
		if(c1.equals("Indian Rupees") && c2.equals("Indian Rupees"))
		{
			label1.setText(Float.toString(curr));
			label2.setText("RUPEES");
		}
		
	}
	public void switchToScene1(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("money.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	
	
}