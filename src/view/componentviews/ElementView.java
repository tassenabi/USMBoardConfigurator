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

    public ElementView() {

        labelElement = new Label("Element");
    }

    public Label getLabelElement() {
        return this.labelElement;
    }

    public ComboBox getModel() {

        ComboBox comboElement = new ComboBox<>(ElementModel.getModel());

        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();

        return comboElement;
    }
}
