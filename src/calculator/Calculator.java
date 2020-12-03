package calculator;

import Entities.elemente.ElementEinschubTuer;
import Entities.elemente.ElementMitAusziehTuer;
import Entities.elemente.ElementMitAusziehtuerMitEinlegeRahmen;
import Entities.elemente.ElementMitKlappTuer;
import org.apache.commons.lang3.ArrayUtils;
import view.masterView.SingleBoardElementView;

public class Calculator {

    private SingleBoardElementView[][] allElementsViews;
    private int horizontaleElemente;
    private String txtRollenFuesse;
    private String txtSchloesserGriffe;

    public Calculator(SingleBoardElementView[][] allElementsViews){

        //Reverse Array, sodass 0/0 und 3/2 nicht mehr auf dem Kopf steht ... wie in der View eigentlich
        ArrayUtils.reverse(allElementsViews);
        this.allElementsViews = allElementsViews;

    }

    public void calculate(){

        //nach jedem Knopfdruck von calculate wird reseted

        //Zaehle horizontale Elemente
        countHorizonteElemente();
        txtSchloesserGriffe = countSchloesserGriffe();
        txtRollenFuesse = getTxtRollenFuesse();
        System.out.println(txtSchloesserGriffe);

    }

    private void countHorizonteElemente(){

        horizontaleElemente = 0;

        for (int zeile = 0; zeile< allElementsViews.length; zeile++){

            for(int spalte = 0; spalte< allElementsViews[zeile].length; spalte++){

                if(zeile == 0 && !allElementsViews[zeile][spalte]
                        .getElementActiveComboBox()
                        .getModel()
                        .getSelectionModel()
                        .getSelectedItem().equals("")){

                    horizontaleElemente = horizontaleElemente +1;

                }

            }

        }
    }

    private String countSchloesserGriffe(){

        int countSchloesserGriffe = 0;

        for (int zeile = 0; zeile< allElementsViews.length; zeile++){

            for(int spalte = 0; spalte< allElementsViews[zeile].length; spalte++){

                if(allElementsViews[zeile][spalte]
                        .getElementView()
                        .getModel()
                        .getSelectionModel()
                        .getSelectedItem().equals(ElementEinschubTuer.name) ||

                        allElementsViews[zeile][spalte]
                                .getElementView()
                                .getModel()
                                .getSelectionModel()
                                .getSelectedItem().equals(ElementMitAusziehtuerMitEinlegeRahmen.name) ||

                        allElementsViews[zeile][spalte]
                                .getElementView()
                                .getModel()
                                .getSelectionModel()
                                .getSelectedItem().equals(ElementMitKlappTuer.name) ||

                        allElementsViews[zeile][spalte]
                                .getElementView()
                                .getModel()
                                .getSelectionModel()
                                .getSelectedItem().equals(ElementMitAusziehTuer.name)){

                    countSchloesserGriffe = countSchloesserGriffe +1;
                }
            }
        }

        return "Anzahl Schloesser oder Griffe ist: " + countSchloesserGriffe;
    }

    //(n*4)-((n-1)*2), wenn groesser n>0
    private String getTxtRollenFuesse(){

        int anzahlRollenFuesse;
        int anzahlArretierung;

        if(horizontaleElemente>0){
            anzahlRollenFuesse = (horizontaleElemente*4) - ((horizontaleElemente-1)*2);
            anzahlArretierung = anzahlRollenFuesse/2;
        }

        else{
            anzahlRollenFuesse = 0;
            anzahlArretierung = 0;
        }

        return "Anzahl Rollen/Fuesse: " + anzahlRollenFuesse
                + " Anzahl Arretierungen: " + anzahlArretierung;
    }
}
