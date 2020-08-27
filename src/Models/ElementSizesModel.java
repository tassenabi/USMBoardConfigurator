package Models;

import Entities.sizes.Hoehe;
import Entities.sizes.Laenge;
import Entities.sizes.Tiefe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ElementSizesModel {

    public static ObservableList<String> getModelLaenge(){

        ObservableList<String> observableList = FXCollections.observableArrayList(
                Laenge.ONE.getValue(),
                Laenge.TWO.getValue(),
                Laenge.THREE.getValue(),
                Laenge.FOUR.getValue(),
                Laenge.FIVE.getValue()
        );

        return observableList;
    }

    public static ObservableList<String> getModelTiefe(){

        ObservableList<String> observableList = FXCollections.observableArrayList(
                Tiefe.ONE.getValue(),
                Tiefe.TWO.getValue(),
                Tiefe.THREE.getValue()
        );

        return observableList;
    }

    public static ObservableList<String> getModelHoehe(){

        ObservableList<String> observableList = FXCollections.observableArrayList(
                Hoehe.ONE.getValue(),
                Hoehe.TWO.getValue(),
                Hoehe.THREE.getValue(),
                Hoehe.FOUR.getValue(),
                Hoehe.FIVE.getValue(),
                Hoehe.SIX.getValue()
        );

        return observableList;
    }
}
