package top.codecool.demo.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //FXMLLoader
        //AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("main.fxml"));

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        AnchorPane anchorPane = fxmlLoader.load();
        //Scene
        Scene scene = new Scene(anchorPane);

        stage.setTitle("The first window");
        stage.setScene(scene);

        stage.show();




    }
}
