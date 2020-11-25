package view.componentviews;

import Entities.zubehoer.ZubehoerAusziehTablar;
import Models.ZubehoerModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ZubehoerView {

    private Label labelAccessory;

    public ZubehoerView(){

        labelAccessory = new Label("Zubehörteile");
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
}