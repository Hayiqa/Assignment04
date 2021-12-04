package application;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Age {

	@FXML
	private DatePicker myDatePicker;
	@FXML
	private Label myLabel = new Label();
	@FXML
	private Label Label = new Label();
	@FXML
	private Label Label2 = new Label();
	@FXML
	private Label Label3 = new Label();
	@FXML
	private Label Label4 = new Label();
	@FXML
	private Label Label5 = new Label();
	@FXML
	private Label Label6 = new Label();
	@FXML
	private Label Label7 = new Label();
	@FXML
	private Button Go;
	private String myFormattedDate;
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void getDate(ActionEvent event) {

		LocalDate myDate = myDatePicker.getValue();
		myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		myLabel.setText(myFormattedDate);
	}

	@FXML
	private void displable() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		Label.setText(dtf.format(now));

		String[] stringarray = myFormattedDate.split("-");
		String[] stringarray2 = dtf.format(now).split("/");

		int agecal = Integer.valueOf(stringarray2[2]) - Integer.valueOf(stringarray[2]);
		Label2.setText(Integer.toString(agecal));
		Label6.setText(Integer.toString(agecal));

		LocalDate today = LocalDate.now();

		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String dayWeekText = new SimpleDateFormat("EEEE").format(date);
		Label7.setText(dayWeekText);

		if (stringarray[0].equals("01")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.JANUARY,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");

		}
		if (stringarray[0].equals("02")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.FEBRUARY,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("03")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.MARCH,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("04")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.APRIL,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("05")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.MAY,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("06")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.JUNE,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("07")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.JULY,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("08")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.AUGUST,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("09")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.SEPTEMBER,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("10")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.OCTOBER,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("11")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.NOVEMBER,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}
		if (stringarray[0].equals("12")) {
			LocalDate birthday = LocalDate.of(Integer.parseInt(stringarray[2]), Month.DECEMBER,
					Integer.parseInt(stringarray[1]));
			LocalDate nextBDay = birthday.withYear(today.getYear());

			// If your birthday has occurred this year already, add 1 to the year.
			if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
				nextBDay = nextBDay.plusYears(1);
			}

			Period p = Period.between(today, nextBDay);
			long p2 = ChronoUnit.DAYS.between(today, nextBDay);
			Label3.setText(p.getMonths() + " Months | " + p.getDays() + " Days");
			Label4.setText(Long.toString(p2));
			Label5.setText(p.getMonths() + " ");
		}

	}
	
	public void switchToScene3(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
