package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button myButton;
    @FXML
    private Label mLabel;
    public void show(ActionEvent event) {
        mLabel.setText("HelloWorld");
    }
}
