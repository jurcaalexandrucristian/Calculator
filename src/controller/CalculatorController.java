package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CalculatorController implements Initializable {
    private Double data = 0.0;
    private int operation = -1;

    @FXML private Button keyMinus;
    @FXML private Button keyNine;
    @FXML private Button keySix;
    @FXML private Button keyMult;
    @FXML private Button keyOne;
    @FXML private Button clear;
    @FXML private Button keySeven;
    @FXML private Button keyTwo;
    @FXML private Button keyThree;
    @FXML private Button keyPlus;
    @FXML private Button keyEight;
    @FXML private Button keyZero;
    @FXML private Button keyDiv;
    @FXML private Button keyFour;
    @FXML private Button keyDot;
    @FXML private Button keyEquals;
    @FXML private Button keyFive;

    @FXML private ImageView utilImg;
    @FXML private TextField result;

    @FXML 
    void entered(MouseEvent event) {
        Button button = (Button) event.getSource();
        button.setCursor(Cursor.HAND);
    }

    @FXML
    void exited(MouseEvent event) {
        Button button = (Button) event.getSource();
        button.setCursor(Cursor.DEFAULT);
    }

    @FXML
    void utilEntered(MouseEvent event) {
        ImageView img = (ImageView) event.getSource();
        img.setCursor(Cursor.HAND);
    }

    @FXML
    void utilExited(MouseEvent event) {
        ImageView img = (ImageView) event.getSource();
        img.setCursor(Cursor.DEFAULT);
    }
    
    @FXML
    void close(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void minimize(MouseEvent event) {
        Stage stage = (Stage) ((ImageView) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void handle(ActionEvent event) {
        if (event.getSource() == keyOne)
            result.setText(result.getText() + "1");
        else if (event.getSource() == keyTwo)
            result.setText(result.getText() + "2");
        else if (event.getSource() == keyThree)
            result.setText(result.getText() + "3");
        else if (event.getSource() == keyFour)
            result.setText(result.getText() + "4");
        else if (event.getSource() == keyFive)
            result.setText(result.getText() + "5");
        else if (event.getSource() == keySix)
            result.setText(result.getText() + "6");
        else if (event.getSource() == keySeven)
            result.setText(result.getText() + "7");
        else if (event.getSource() == keyEight)
            result.setText(result.getText() + "8");
        else if (event.getSource() == keyNine)
            result.setText(result.getText() + "9");
        else if (event.getSource() == keyZero)
            result.setText(result.getText() + "0");
        else if (event.getSource() == keyDot)
            result.setText(result.getText() + ".");
        else if (event.getSource() == clear)
            result.setText("");
        else if (event.getSource() == keyPlus) {
            data = Double.parseDouble(result.getText());
            operation = 1;
            result.setText("");
        } else if (event.getSource() == keyMinus) {
            data = Double.parseDouble(result.getText());
            operation = 2;
            result.setText("");
        } else if (event.getSource() == keyMult) {
            data = Double.parseDouble(result.getText());
            operation = 3;
            result.setText("");
        } else if (event.getSource() == keyDiv) {
            data = Double.parseDouble(result.getText());
            operation = 4;
            result.setText("");
        } else if (event.getSource() == keyEquals) {
            Double secondOperand = Double.parseDouble(result.getText());
            switch (operation) {
                case 1:
                    Double answer = data + secondOperand;
                    result.setText(String.valueOf(answer));
                    break;
                case 2:
                    answer = data - secondOperand;
                    result.setText(String.valueOf(answer));
                    break;
                case 3:
                    answer = data * secondOperand;
                    result.setText(String.valueOf(answer));
                    break;
                case 4:
                    answer = 0.0;
                    try {
                        answer = data / secondOperand;
                    } catch (Exception e) { result.setText("Error"); }
                    result.setText(String.valueOf(answer));
                    break;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        utilImg.setOnContextMenuRequested(event -> {
            
        });
    }
}

