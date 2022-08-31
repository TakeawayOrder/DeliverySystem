package top.codecool.demo.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController {
    @FXML
    private Button passWordBtn;

    @FXML
    private  Button LogInBtn;

    @FXML
    private Label emailLabel;

    @FXML
    private  Label passWordLabel;

    @FXML
    private TextField emailText;

    @FXML
    private  TextField passWordText;


    private  Stage stage;
//
//    public LogInController() {
//    }

    @FXML
     void getPassWord(ActionEvent event){

    }

    @FXML
    void LogIn(ActionEvent event) throws IOException {
//        try {
//            Parent pane = FXMLLoader.load(getClass().getResource("D://liupiao//demo//src//main//java//top//codecool//demo//test//main.fxml"));
            System.out.println("1");
        AnchorPane anchorPane =
              FXMLLoader.load(this.getClass().getResource("jetbrains://idea/navigate/reference?project=pom.xml&path=top/codecool/demo/main.fxml"));
//            BorderPane borderPane =
//                    FXMLLoader.load(this.getClass().getResource("main.fxml"));
            System.out.println("2");

//            FXMLLoader fxmlLoader = new FXMLLoader(top.codecool.demo.test.Main.class.getResource("../../test/main.fxml"));
//            AnchorPane anchorPane = fxmlLoader.load();
        Stage stage = new Stage();

        Scene scene = new Scene(anchorPane);

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(scene);

//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner();
            stage.show();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
