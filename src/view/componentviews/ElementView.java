package view.componentviews;

import Models.ElementModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ElementView {

    private Label labelElement;
    private ComboBox comboElement;

    public ElementView() {

        comboElement = new ComboBox<>(ElementModel.getModel());
        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();

        labelElement = new Label("Element");
    }

    public Label getLabelElement() {
        return this.labelElement;
    }

    public ComboBox getModel() {

        return this.comboElement;
    }
}
