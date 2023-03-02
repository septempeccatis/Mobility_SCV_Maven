package com.example.mobility_scv_maven;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {
    static Thread thread;
    public void OnConnectAction(MouseEvent e) throws IOException, InterruptedException {
        RemoteDevice.RemoteDeviceDiscovery();
        if(RemoteDevice.ConnectDevice("98D3A1FD3918","1")){
            Node node=(Node) e.getSource();
            Stage stage=(Stage) node.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Page_main.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            //멀티 스래드를 사용
            thread = new Thread(DataTask.task);
            //background Service 지정
            thread.setDaemon(true);
            //Data receive Thread 시작
            thread.start();

        }else{
            System.out.println("Not Connected");
        }
    }
}


