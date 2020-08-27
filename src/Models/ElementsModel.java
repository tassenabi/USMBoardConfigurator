package Models;

import Entities.elements.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ElementsModel {

    public static ObservableList<String> getModel(){

        return FXCollections.observableArrayList(
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