package top.codecool.demo.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField myAgeTxt;

    @FXML
    Button myLoginBtn;

    @FXML
    Label message;



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



}
