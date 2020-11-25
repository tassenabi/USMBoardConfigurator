package view.componentviews;

import Entities.elemente.ElementEinschubTuer;
import Models.ElementModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class ElementView {

    private Label labelElement;
    private ImageView elementImageView;


    public ElementView(){

        labelElement = new Label("Element");
        elementImageView = generateElementImageView(ElementEinschubTuer.path);
    }

    public Label getLabelElement(){
        return this.labelElement;
    }

    public ComboBox getModel(){

        ComboBox comboElement = new ComboBox<>(ElementModel.getModel());

        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();

        return comboElement;
    }

    public ImageView getElementImageView(){
        return this.elementImageView;
    }

    private ImageView generateElementImageView(String sourcePath) {

        File file = new File(sourcePath);
        Image image = new Image(file.toURI().toString());
        ImageView imageViewElement = new ImageView();
        imageViewElement.setImage(image);
        imageViewElement.setFitHeight(28);
        imageViewElement.setFitWidth(40);

        return imageViewElement;

    }
}
