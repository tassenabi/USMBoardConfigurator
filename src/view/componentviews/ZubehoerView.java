package view.componentviews;

import Entities.zubehoer.ZubehoerAusziehTablar;
import Models.ZubehoerModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class ZubehoerView {

    private Label labelAccessory;
    private ImageView accessoryOneImage;

    public ZubehoerView(){

        labelAccessory = new Label("Zubehörteile");
        accessoryOneImage = generateAccessoresImageView(ZubehoerAusziehTablar.path);
    }

    public ImageView getImageView(){

        return this.accessoryOneImage;
    }
    public Label getLabelAccessory(){
        return this.labelAccessory;
    }

    public ComboBox getModel(){

        ComboBox comboElement = new ComboBox<>(ZubehoerModel.getModel());

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