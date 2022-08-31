package  top.codecool.demo.View;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import top.codecool.demo.model.Category;
import top.codecool.demo.model.Dish;

import java.net.URL;
import java.util.ResourceBundle;

public class main_1Controller implements Initializable {

    @FXML
    private ListView<Category> listView;

    @FXML
    private TableColumn<Dish,String> dishIdColumn;
    @FXML
    private TableColumn<Dish,String> dishNameColumn;
    @FXML
    private TableColumn<Dish,String> imagePathColumn;
    @FXML
    private TableColumn<Dish,Double> priceColumn;


    @FXML
    private TableView<Dish> tableView;

    String[] food = {"A", "B", "C"};

    Category[] categories = {new Category(), new Category(), new Category()};

    private ObservableList<Dish>dishData= FXCollections.observableArrayList();//动态集合

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        dishData.add(new Dish("D001","AAA","lightbulb_01.png",100.3));
        dishData.add(new Dish("D002","BBB","lightbulb_01.png",435.45));
        dishData.add(new Dish("D003","CCC","lightbulb_01.png",345.345));
        dishData.add(new Dish("D004","DDD","lightbulb_01.png",657.7868));
        dishData.add(new Dish("D005","EEE","lightbulb_01.png",456.687));


        //lambda表达式
//        dishIdColumn.setCellValueFactory(cellData->cellData.getValue().dishIdProperty());
//        dishNameColumn.setCellValueFactory(cellData->cellData.getValue().dishNameProperty());
//        imagePathColumn.setCellValueFactory(cellData->cellData.getValue().imagePathProperty());
//        priceColumn.setCellValueFactory(cellData->cellData.getValue().priceProperty());


        tableView.setItems(dishData);
        listView.getItems().addAll(categories);


        tableView.getSelectionModel().selectedItemProperty().addListener((observable,old)->showDish(newValue));

    }

    private void showDish(){
        System.out.println(dish.getIt);
    }



}
