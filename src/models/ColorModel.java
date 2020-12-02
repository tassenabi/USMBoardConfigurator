package models;

import Entities.elemente.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ColorModel {

    public static ObservableList<String> getModel(){

        return FXCollections.observableArrayList(
                Colors.reinweiss,
                Colors.lichtgrau,
                Colors.usmMattsilber,
                Colors.mittelgrau,
                Colors.anthrazitgrau,
                Colors.graphitschwarz,
                Colors.stahlblau,
                Colors.enzianblau,
                Colors.usmGruen,
                Colors.goldgelb,
                Colors.reinorange,
                Colors.usmRobinrot,
                Colors.usmBraun,
                Colors.usmBeige
        );
    }
}
