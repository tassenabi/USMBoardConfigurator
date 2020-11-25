package view;

import config.ApplicationSizeResolution;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.security.cert.X509Certificate;

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
        SingleBoardElementView oneSingleBoardElementView2 = new SingleBoardElementView();
        SingleBoardElementView oneSingleBoardElementView3 = new SingleBoardElementView();
        SingleBoardElementView oneSingleBoardElementView4 = new SingleBoardElementView();

        StackPane root = new StackPane();

        GridPane gp = new GridPane();

        //TODO Alligment setzen zwischen einzelnen Objekten
        //TODO herausfinden wo die Farbe blau gesetzt wird, damit IsElementActive grau oder so wird
        //TODO Button fehlt mit "auswerten"

        Button btn = new Button();
        btn.setText("calculate");



        gp.add(oneSingleBoardElementView, 0,0);
        gp.add(oneSingleBoardElementView2,0,1);

        gp.add(oneSingleBoardElementView3,1,1);

        gp.add(oneSingleBoardElementView4,1,0);

        gp.add(btn,0,2);


        //hier in css auslagern?
        gp.setHgap(30); //horizontal gap in pixels => that's what you are asking for
        gp.setVgap(30); //vertical gap in pixels
        gp.setPadding(new Insets(10, 10, 10, 10)); //


        root.getChildren().add(gp);

        Scene scene  = new Scene(root, 300, 250);

        //StyleSheet setzen
        scene.getStylesheets().add(ApplicationRun.class.getResource("/config/GUIStyles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}