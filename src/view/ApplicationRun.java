package view;

import config.ApplicationSizeResolution;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationRun extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("USM for Jonas and Quintus MOFOS");
        stage.setWidth(ApplicationSizeResolution.VIEW_WIDTH);
        stage.setHeight(ApplicationSizeResolution.VIEW_HEIGHT);
        SingleBoardElementView oneSingleBoardElementView = new SingleBoardElementView();
        StackPane root = new StackPane();
        root.getChildren().add(oneSingleBoardElementView);
        Scene scene  = new Scene(root, 300, 250);

        //StyleSheet setzen
        scene.getStylesheets().add(ApplicationRun.class.getResource("/config/GUIStyles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}