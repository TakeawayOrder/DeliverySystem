module top.codecool.demo {

    requires javafx.controls;
    requires javafx.fxml;



    opens top.codecool.demo to javafx.fxml;
    opens top.codecool.demo.View to javafx.fxml;



    exports top.codecool.demo;
    exports top.codecool.demo.View;

}