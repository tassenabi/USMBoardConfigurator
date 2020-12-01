package view.componentviews;

import Models.ColorModel;
import javafx.scene.control.ComboBox;

public class ColorView {

    private ComboBox comboElement;

    public ColorView(){

        comboElement = new ComboBox<>(ColorModel.getModel());
        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();
    }

    public ComboBox getModel() {

        return this.comboElement;
    }
}
