package Models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class IsElementActiveModel {

    private static final String aktiv = "ausgewählt";
    private static final String deaktiviert = "";

    public static ObservableList<String> getModel(){

        return FXCollections.observableArrayList(
                deaktiviert,
                aktiv
        );
    }
}