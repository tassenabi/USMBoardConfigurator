package view.componentviews;

import Models.IsElementActiveModel;
import javafx.scene.control.ComboBox;

public class IsElementActiveView {

        public ComboBox getModel() {

            ComboBox comboElement = new ComboBox<>(IsElementActiveModel.getModel());

            comboElement.setMaxWidth(120);
            comboElement.getSelectionModel().selectFirst();

            return comboElement;
        }
}
