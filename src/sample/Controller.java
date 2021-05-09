package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;



public class Controller<duble> implements Initializable {
    @FXML
    private Spinner<Integer> Latte_sp;
    final int initialValue = 0;

    SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,initialValue);


    @FXML
    private Spinner<Integer> Americano_sp;

    SpinnerValueFactory<Integer> svf2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,initialValue);

    @FXML
    private Spinner<Integer> Espresso_sp;

    SpinnerValueFactory<Integer> svf3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,initialValue);

    @FXML
    private Spinner<Integer> Cappucino_sp;

    SpinnerValueFactory<Integer> svf4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,initialValue);

    @FXML
    private Spinner<Integer> Mocha_sp;

    SpinnerValueFactory<Integer> svf5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,initialValue);

    @FXML
    private Spinner<Integer> Tears_sp;

    SpinnerValueFactory<Integer> svf6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,initialValue);

    @FXML
    private Button btn_exit;

    @FXML
    private Button Order_btn;

    @FXML
    private Button Help_btn;


    @FXML
    public void onClick_btn_exit(javafx.event.ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onClick_btn_help(javafx.event.ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("HELP");
        alert.setHeaderText(null);
        alert.setContentText("Customer Service Home\n" +
                "\n" +
                "Hours: 4AM - 10PM PT, 7 days a week\n" +
                "Email:\n" +
                "aidar.bekturov@iaau.edu.kg\n" +
                "\n" +
                "Phone:\n" +
                "+996778570924ccc" +
                "Hours: 5AM – 8PM PT, 7 days a week");
        alert.showAndWait();
    }

    @FXML
    public void onClick_btn_order(javafx.event.ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("ORDER");
        alert.setHeaderText(null);
        double l;
        double a;
        double e;
        double c;
        double m;
        double t;
        double sum;
        alert.setContentText(new StringBuilder().append(l = Latte_sp.getValue() * 6.69).append( " $ - Latte\n")
                .append(a = Americano_sp.getValue() * 7.9).append(" $ - Americano\n")
                .append(e = Espresso_sp.getValue() * 6.6).append(" $ - Espresso\n")
                .append(c = Cappucino_sp.getValue() * 8.8) .append( " $ - Cappucino\n")
                .append(m = Mocha_sp.getValue() * 4.2).append(" $ - Mocha\n")
                .append(t = Tears_sp.getValue() * 1).append(" $ - Tears\n------------------\n")
                .append(sum = (l + a + e + c + m + t)).append(" $ - Sum\n\n")
                .append("Thank you for being our valued customer. \nWe are so grateful for the pleasure of serving you and \nhope we met your expectations. Your order will be \nready as soon as possible"
                ).toString());

        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Latte_sp.setValueFactory(svf);
        Americano_sp.setValueFactory(svf2);
        Espresso_sp.setValueFactory(svf3);
        Cappucino_sp.setValueFactory(svf4);
        Mocha_sp.setValueFactory(svf5);
        Tears_sp.setValueFactory(svf6);
        Americano_sp.setEditable(true);
        Espresso_sp.setEditable(true);
        Cappucino_sp.setEditable(true);
        Mocha_sp.setEditable(true);
        Tears_sp.setEditable(true);

    }


    public void onClick_sp_latte(MouseEvent mouseEvent) {
    }
}
