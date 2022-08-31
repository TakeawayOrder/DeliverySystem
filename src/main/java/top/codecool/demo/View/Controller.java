package top.codecool.demo.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private TextField myAgeTxt;

    @FXML
    private Button myLoginBtn;

    @FXML
    private Label message;

    @FXML
    private ImageView image;

    @FXML
    private CheckBox myCheckBox;
    Image image_1=
            new Image(this.getClass().getResourceAsStream("lightbulb_01.png"));
    Image image_2=
            new Image(this.getClass().getResourceAsStream("lightbulb_01_on.png"));

    @FXML
    void change(ActionEvent event) {
        if(this.myCheckBox.isSelected()) {
            No_Off.setText("灯已开");
            image.setImage(image_2);
        }
        else {
            No_Off.setText("灯已关");
            image.setImage(image_1);
        }
    }


    @FXML
    Label No_Off;



    public void submit(ActionEvent event) {

        System.out.println("clicked");

        try{
            String ageStr = this.myAgeTxt.getText();
            int age = Integer.parseInt(ageStr);

            if(age >= 18) {
                message.setText("Ok");
            }
            else {
                message.setText("Age must 18+");
            }

        }
        catch (NumberFormatException e) {
            System.out.println("error");
        }

    }

//    boolean OK=true;
//    public void change(ActionEvent event) {
//        if (OK){
//            No_Off.setText("灯已开");
////            image.setImage(image_1);
//            OK=false;
//        }
//        else {
//            No_Off.setText("灯已关");
////            image.setImage(image_2);
//            OK=true;
//        }
//    }


}
