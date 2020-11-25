package view.componentviews;

import Models.ElementSizesModel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ElementSizesView {

    private Label labelHoehe;
    private Label labelLaenge;
    private Label labelTiefe;

    public ElementSizesView(){

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

        ComboBox comboHoehe = new ComboBox<>(ElementSizesModel.getModelHoehe());
        comboHoehe.setMaxWidth(53);
        comboHoehe.getSelectionModel().selectFirst();

        return comboHoehe;
    }

    public ComboBox getModelLaenge(){

        ComboBox comboLaenge = new ComboBox<>(ElementSizesModel.getModelLaenge());
        comboLaenge.setMaxWidth(53);
        comboLaenge.getSelectionModel().selectFirst();

        return comboLaenge;
    }

    public ComboBox getModelTiefe(){

        ComboBox comboTiefe = new ComboBox<>(ElementSizesModel.getModelTiefe());
        comboTiefe.setMaxWidth(53);
        comboTiefe.getSelectionModel().selectFirst();

        return comboTiefe;
    }
}