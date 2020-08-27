package Models;

import Entities.accessories.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AccessoryModel {

    public static ObservableList<String> getModel(){

        return FXCollections.observableArrayList(
                AccessoryAusziehTablar.name,
                AccessoryAusziehTablarUmgekehrt.name,
                AccessoryAusziehTablarEinlegeRahmen.name,
                AccessoryZwischentablar.name,
                AccessorySchublade.name,
                AccessoryKabelauslass.name
        );
    }
}