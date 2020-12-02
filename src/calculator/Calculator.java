package calculator;

import org.apache.commons.lang3.ArrayUtils;
import view.masterView.SingleBoardElementView;

public class Calculator {

    //Counts
    private int countAllBoardElements;
    private int countVertikaleBoardElements;
    private int countHorizontaleBoardElements;

    private int countKnaufeOderSchloss;

    public Calculator(){

    }

    public void calculate(SingleBoardElementView[][] allElementsViews){

        //Reverse Array, sodass 0/0 und 3/2 nicht mehr auf dem Kopf steht ... wie in der View eigentlich
        ArrayUtils.reverse(allElementsViews);

        //nach jedem Knopfdruck von calculate wird reseted
        this.resetNumbers();

        for (int zeile = 0; zeile< allElementsViews.length; zeile++){

            for(int spalte = 0; spalte< allElementsViews[zeile].length; spalte++){

                countAllActiveElements(allElementsViews, zeile, spalte);


                 if(zeile == 0 && !allElementsViews[zeile][spalte]
                                          .getElementActiveComboBox()
                                          .getModel()
                                          .getSelectionModel()
                                          .getSelectedItem().equals("")){

                     countHorizontaleBoardElements = countHorizontaleBoardElements +1;

                 }


            }

        }
        System.out.println("hor:" + countHorizontaleBoardElements);
    }

    private void countAllActiveElements(SingleBoardElementView[][] allElementsViews, int zeile, int spalte) {
        //Anzahl aktiv ausgewaehlter BoardElemente
        if(!allElementsViews[zeile][spalte].
                getElementActiveComboBox()
                .getModel()
                .getSelectionModel()
                .getSelectedItem().equals("")){

            countAllBoardElements = countAllBoardElements+1;


        }
    }

    private void resetNumbers() {

        this.countAllBoardElements = 0;
        this.countVertikaleBoardElements = 0;
        this.countHorizontaleBoardElements = 0;
    }

}
