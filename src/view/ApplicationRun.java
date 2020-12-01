package view;

import calculator.Calculator;
import config.ApplicationSizeResolution;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.commons.lang3.ArrayUtils;
import view.masterView.SingleBoardElementView;

public class ApplicationRun extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("USM for Jonas and Quintus MOFOS");
        stage.setWidth(ApplicationSizeResolution.VIEW_WIDTH);
        stage.setHeight(ApplicationSizeResolution.VIEW_HEIGHT);

        StackPane root = new StackPane();

        //TODO Validator ausbauen
        //TODO Printer bauen -> toString Methoden überall einbauen

        Button btn = new Button();
        btn.setText("calculate");

        GridPane gp = new GridPane();
        ScrollPane sp = new ScrollPane(gp);
        sp.setFitToWidth(true);
        sp.setVvalue(3.0d);
        gp.add(sp, 0, 10);
        gp.setHgrow(sp, Priority.ALWAYS);


        //Denk dran, Array-Groesse != Startbeginn ... lol, was ein Anfaengerfehler
        //Ausserdem Array quasi auf dem Kopf initialisieren (aus View gesehen)
        SingleBoardElementView[][] views = new SingleBoardElementView[3][3];

        for (int zeile =0; zeile< views.length; zeile++){

            for(int spalte = 0; spalte< views[zeile].length; spalte++){

                views[zeile][spalte] = new SingleBoardElementView();
                gp.add(views[zeile][spalte],spalte,zeile);

            }
        }

        ArrayUtils.reverse(views);

        gp.add(btn,0,11);
        gp.getStyleClass().add("custom-node");

        //hier in css auslagern?
        gp.setHgap(30); //horizontal gap in pixels => that's what you are asking for
        gp.setVgap(30); //vertical gap in pixels
        gp.setPadding(new Insets(10, 10, 10, 10)); //


        root.getChildren().addAll(gp, sp);

        Scene scene  = new Scene(root, 300, 250);

        //StyleSheet setzen
        scene.getStylesheets().add(ApplicationRun.class.getResource("/config/GUIStyles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

        Calculator cal = new Calculator();
        btn.setOnAction(e-> cal.calculate(views));
    }

}