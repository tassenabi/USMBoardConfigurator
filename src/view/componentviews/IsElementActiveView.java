package view.componentviews;

import models.IsElementActiveModel;
import javafx.scene.control.ComboBox;

public class IsElementActiveView {

    private ComboBox comboElement;

    public IsElementActiveView(){

        comboElement = new ComboBox<>(IsElementActiveModel.getModel());
        comboElement.setMaxWidth(120);
        comboElement.getSelectionModel().selectFirst();

    }
        public ComboBox getModel() {

            return this.comboElement;
        }
}