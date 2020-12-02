package models;

import Entities.elemente.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ElementModel {

    public static ObservableList<String> getModel(){

        return FXCollections.observableArrayList(
                "",
                ElementMitRueckwand.name,
                ElementOhneRueckwand.name,
                ElementOhneSeitenPanel.name,
                ElementOhneAlles.name,
                ElementMitKlappTuer.name,
                ElementMitAusziehTuer.name,
                ElementMitAusziehtuerMitEinlegeRahmen.name,
                ElementEinschubTuer.name
        );
    }
}