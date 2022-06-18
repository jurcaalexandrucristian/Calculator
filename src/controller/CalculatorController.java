package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {
    Double data = 0.0;
    int operation = -1;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField result;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button dot;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    void handle(ActionEvent event) {
        if (event.getSource() == one) {
            result.setText(result.getText() + "1");
        } else if (event.getSource() == two) {
            result.setText(result.getText() + "2");
        } else if (event.getSource() == three) {
            result.setText(result.getText() + "3");
        } else if (event.getSource() == four) {
            result.setText(result.getText() + "4");
        } else if (event.getSource() == five) {
            result.setText(result.getText() + "5");
        } else if (event.getSource() == six) {
            result.setText(result.getText() + "6");
        } else if (event.getSource() == seven) {
            result.setText(result.getText() + "7");
        } else if (event.getSource() == eight) {
            result.setText(result.getText() + "8");
        } else if (event.getSource() == nine) {
            result.setText(result.getText() + "9");
        } else if (event.getSource() == zero) {
            result.setText(result.getText() + "0");
        } else if (event.getSource() == dot) {
            result.setText(result.getText() + ".");
        } else if (event.getSource() == clear) {
            result.setText("");
        } else if (event.getSource() == plus) {
            data = Double.parseDouble(result.getText());
            operation = 1;
            result.setText("");
        } else if (event.getSource() == minus) {
            data = Double.parseDouble(result.getText());
            operation = 2;
            result.setText("");
        } else if (event.getSource() == mult) {
            data = Double.parseDouble(result.getText());
            operation = 3;
            result.setText("");
        } else if (event.getSource() == div) {
            data = Double.parseDouble(result.getText());
            operation = 4;
            result.setText("");
        } else if (event.getSource() == equals) {
            Double secondOperand = Double.parseDouble(result.getText());
            switch (operation) {
                case 1:
                    Double ans = data + secondOperand;
                    result.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = data - secondOperand;
                    result.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data * secondOperand;
                    result.setText(String.valueOf(ans));
                    break;
                case 4:
                    ans = 0.0;
                    try {
                        ans = data / secondOperand;
                    } catch(Exception e) { result.setText("Error"); }
                    result.setText(String.valueOf(ans));
                    break;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {}
}

