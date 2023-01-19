package com.example.mobility_scv_maven;

import com.jfoenix.animation.alert.CenterTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable {
    @FXML private BorderPane pane;
    @FXML private AnchorPane pane_main,user,data,info;
    @FXML private Text time,date,text_info;

    @Override
    public void initialize(URL location, ResourceBundle resources){}

    @FXML
    private void click_usr(MouseEvent event){
        loadPage("User");
    }
    @FXML
    private void click_data(MouseEvent event){
        loadPage("Data");
    }
    @FXML
    private void click_graph(MouseEvent event){
        loadPage("Graph");
    }

    private void loadPage(String page) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
            pane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}