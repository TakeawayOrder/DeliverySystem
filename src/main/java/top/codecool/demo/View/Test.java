package top.codecool.demo.View;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        //FXMLLoader
        //AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("main.fxml"));

//        FXMLLoader fxmlLoader = new FXMLLoader(Main_1.class.getResource("View/LonIn.fxml"));
//        AnchorPane anchorPane = fxmlLoader.load();

        AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("main_1.fxml"));

        Scene scene = new Scene(anchorPane);


        stage.setScene(scene);

        stage.show();


    }


}