package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private TextField textField;

        @FXML
        private Button button1;

    @FXML
    public void handleButtonAction(ActionEvent actionEvent) {
        String text = textField.getText();
        label.setText("Hello, " + text + "!");
    }

    @FXML
    void initialize() {
        button1.setOnAction(event -> {

            // hide current window
            button1.getScene().getWindow().hide();

            // подгружаем новое окно
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass()
                    .getResource("/sample/second_window.fxml"));

            try {
                loader.load(); // загружаем окно
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}
