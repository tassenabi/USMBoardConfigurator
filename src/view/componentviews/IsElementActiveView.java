package view.componentviews;

import Models.IsElementActiveModel;
import javafx.scene.control.ComboBox;

public class IsElementActiveView {

        public ComboBox getModel() {

            ComboBox comboElement = new ComboBox<>(IsElementActiveModel.getModel());

            comboElement.setMaxWidth(120);
            comboElement.getSelectionModel().selectFirst();

            comboElement.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(oldValue));

            return comboElement;
        }
}