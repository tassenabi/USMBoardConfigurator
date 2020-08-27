package view;

import Entities.accessories.AccessoryAusziehTablar;
import Models.AccessoryModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class AccessoryView {

    private Label labelAccessory;
    private ImageView accessoryOneImage;

    public AccessoryView(){

        labelAccessory = new Label("Zubehörteile");
        accessoryOneImage = generateAccessoresImageView(AccessoryAusziehTablar.path);
    }

    public ImageView getImageView(){

        return this.accessoryOneImage;
    }
    public Label getLabelAccessory(){
        return this.labelAccessory;
    }

    public ComboBox getModel(){

        ComboBox comboElement = new ComboBox<>(AccessoryModel.getModel());

        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();

        return comboElement;
    }

    public ImageView getAccessoryOneImage(){
        return this.accessoryOneImage;
    }

    private ImageView generateAccessoresImageView(String sourcePath) {

        File file = new File(sourcePath);
        Image image = new Image(file.toURI().toString());
        ImageView imageViewElement = new ImageView();
        imageViewElement.setImage(image);
        imageViewElement.setFitHeight(28);
        imageViewElement.setFitWidth(40);

        return imageViewElement;
    }
}