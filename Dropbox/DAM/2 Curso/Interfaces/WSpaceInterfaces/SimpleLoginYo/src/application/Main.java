package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        this.stage=primaryStage;
        mainWindow();
    }

    public void mainWindow(){
        try {

            FXMLLoader loader=new FXMLLoader(Main.class.getResource("login.fxml"));
            AnchorPane pane=loader.load();
            Scene scene=new Scene(pane);
        scene.getStylesheets().addAll(Main.class.getResource("style.css").toExternalForm());
//        stage.setResizable(true);
//        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }



    public static void main(String[] args) {
        launch();
    }
}
