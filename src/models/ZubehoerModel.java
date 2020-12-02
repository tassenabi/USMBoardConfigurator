package models;

import Entities.zubehoer.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ZubehoerModel {

    public static ObservableList<String> getModel(){

        return FXCollections.observableArrayList(
                "",
                ZubehoerAusziehTablar.name,
                ZubehoerAusziehTablarUmgekehrt.name,
                ZubehoerAusziehTablarEinlegeRahmen.name,
                ZubehoerZwischentablar.name,
                ZubehoerSchublade.name,
                ZubehoerKabelauslass.name
        );
    }
}