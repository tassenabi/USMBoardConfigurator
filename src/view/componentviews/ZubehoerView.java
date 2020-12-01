package view.componentviews;

import Models.ZubehoerModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ZubehoerView {

    private Label labelAccessory;
    private ComboBox comboElement;

    public ZubehoerView(){

        labelAccessory = new Label("Zubehörteile");

        comboElement = new ComboBox<>(ZubehoerModel.getModel());
        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();
    }

    public Label getLabelAccessory(){

        return this.labelAccessory;
    }

    public ComboBox getModel(){

        return this.comboElement;
    }
}