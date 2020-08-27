package view;

import Models.AccessoryModel;
import Models.ElementsModel;
import Models.ElementSizesModel;
import Models.SingleBoardElementModel;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;

import java.io.File;

public class TestView extends StackPane {

    private Image imageElement;
    private ImageView imageView;

    private void createSubGrid(){

    }

    public TestView(){
        createElementImage();
        getChildren().addAll(imageView);
    }

    //TODO hier Image rein von Element
    private void createElementImage(){
        //imageElement = new Image(getClass().getResource("/resources/elementIcons/EinschubTuer.png").toExternalForm());
        File file = new File("src/resources/elementIcons/.EinschubTuer.png");
        imageElement = new Image(file.toURI().toString());
        imageView = new ImageView();
        imageView.setVisible(true);
        imageView.setImage(imageElement);

    }
}