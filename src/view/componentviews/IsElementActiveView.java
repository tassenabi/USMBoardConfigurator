package view.componentviews;

import Models.IsElementActiveModel;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class IsElementActiveView {

        public ComboBox getModel() {

            ComboBox comboElement = new ComboBox<>(IsElementActiveModel.getModel());

            comboElement.setMaxWidth(120);
            comboElement.getSelectionModel().selectFirst();
            //comboElement.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            return comboElement;
        }
}
