package es.alejandro.modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        //System.out.println(getClass().getResource("es/alejandro/interfaces/sample.fxml").getPath());
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("es/alejandro/interfaces/sample.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
