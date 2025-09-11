package edu.realemj.howdyfxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HowdyController {
    private int counter = 0;

    @FXML
    private Button bigButton;

    @FXML
    protected void onBigButtonClicked() {
        counter++;
        bigButton.setText("Click Me!\nHello said " + counter + " times!");
    }
}
