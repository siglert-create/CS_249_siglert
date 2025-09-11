package edu.realemj.howdyfxml;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class HowdyFXML extends Application {

    public void start(Stage primaryStage) {
        Parent root;

        try {
            URL url = getClass().getResource("HowdyFXML.fxml");
            System.out.println("FXML: " + url);

            FXMLLoader loader = new FXMLLoader(url);
            root = loader.load();
        }
        catch(IOException e) {
            System.err.println("ERROR: Could not load FXML file!");
            root = new Label("ERROR!");
        }

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("HowdyFXML Example");
        primaryStage.show();
    }
    
    public static void main(String [] args) {
        launch(args);
    }
}
