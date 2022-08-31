module top.codecool.demo {

    requires javafx.controls;
    requires javafx.fxml;



    opens top.codecool.demo to javafx.fxml;
    opens top.codecool.demo.test to javafx.fxml;
    opens top.codecool.demo.checkbox to javafx.fxml;


    exports top.codecool.demo;
    exports top.codecool.demo.test;
    exports top.codecool.demo.checkbox;

}