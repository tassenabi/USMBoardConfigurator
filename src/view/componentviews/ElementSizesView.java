package view.componentviews;

import models.ElementSizesModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ElementSizesView {

    private Label labelHoehe;
    private Label labelLaenge;
    private Label labelTiefe;

    private ComboBox comboHoehe;
    private ComboBox comboLaenge;
    private ComboBox comboTiefe;

    public ElementSizesView(){

        comboHoehe = new ComboBox<>(ElementSizesModel.getModelHoehe());
        comboHoehe.setMaxWidth(53);
        comboHoehe.getSelectionModel().selectFirst();

        comboLaenge = new ComboBox<>(ElementSizesModel.getModelLaenge());
        comboLaenge.setMaxWidth(53);
        comboLaenge.getSelectionModel().selectFirst();

        comboTiefe = new ComboBox<>(ElementSizesModel.getModelTiefe());
        comboTiefe.setMaxWidth(53);
        comboTiefe.getSelectionModel().selectFirst();

        labelHoehe = new Label("Höhe");
        labelLaenge = new Label("Länge");
        labelTiefe = new Label("Tiefe");
    }

    public Label getHoehe(){
        return this.labelHoehe;
    }

    public Label getLaenge(){
        return this.labelLaenge;
    }

    public Label getTiefe(){
        return this.labelTiefe;
    }

    public ComboBox getModelHoehe(){

        return this.comboHoehe;
    }

    public ComboBox getModelLaenge(){

        return this.comboLaenge;
    }

    public ComboBox getModelTiefe(){

        return this.comboTiefe;
    }
}