package com.example.mobility_scv_maven;

import javafx.application.Application;;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.bluetooth.*;
import java.io.IOException;
import java.util.Vector;

public class MainAct extends Application {
    double x,y = 0;

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Page_main.fxml"));
        Scene scene = new Scene(root, 480, 320);
        stage.setTitle("UI");
        stage.initStyle(StageStyle.UNDECORATED);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){launch(args);}
}