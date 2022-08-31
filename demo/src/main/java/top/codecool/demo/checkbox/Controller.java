package top.codecool.demo.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView myImageView;

    @FXML
    private Label myLabel;

    @FXML
    private CheckBox myCheckbox;

    Image image1 =
            new Image(this.getClass().getResourceAsStream("lightbulb_01_on.png"));
    Image image2 = new Image(this.getClass().getResourceAsStream("lightbulb_01.png")) ;

    @FXML
    void change(ActionEvent event) {
        if(this.myCheckbox.isSelected()) {
            myLabel.setText("ON");
            myImageView.setImage(image1);
        }
        else {
            myLabel.setText("OFF");
            myImageView.setImage(image2);
        }
    }
}
