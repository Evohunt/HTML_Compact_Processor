package FD_Processor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/main.fxml"));
        primaryStage.setTitle("FD HTML Processor");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
