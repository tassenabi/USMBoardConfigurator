package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

public class TestNeu extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("RRR for Jonas and Quintus MOFOS");
        StackPane sp = new StackPane();
        File file = new File("src/resources/elementsIcons/EinschubTuer.png");
        Image image = new Image(file.toURI().toString());

        //Image image = new Image("http://mikecann.co.uk/wp-content/uploads/2009/12/javafx_logo_color_1.jpg");

        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setVisible(true);
        sp.getChildren().add(imageView);
        Scene scene  = new Scene(sp, 300, 250);

        //StyleSheet setzen
        //scene.getStylesheets().add(ApplicationRun.class.getResource("/GUIStyles/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
