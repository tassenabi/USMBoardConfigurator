package view.componentviews;

import Models.ColorModel;
import javafx.scene.control.ComboBox;

public class ColorView {

    public ComboBox getModel() {

        ComboBox comboElement = new ComboBox<>(ColorModel.getModel());

        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();

        return comboElement;
    }
}
