package calculator;

import view.masterView.SingleBoardElementView;

public class Calculator {

    private int countBoardElements;
    private int countKnaufeOderSchloss;

    public Calculator(){




    }

    public void calculate(SingleBoardElementView[][] allElementsViews){

        for (int zeile = 0; zeile< allElementsViews.length; zeile++){

            for(int spalte = 0; spalte< allElementsViews[zeile].length; spalte++){

                //ist ausgewaehlt
                System.out.println("zeile: " + zeile + " spalte: " + spalte + " value " + allElementsViews[zeile][spalte]
                        .getColorView()
                        .getModel()
                        .getSelectionModel()
                        .getSelectedItem());









                //Anzahl aktiv ausgewaehlter BoardElemente
                if(!allElementsViews[zeile][spalte].getElementActiveComboBox().getModel().getValue().equals("")){

                    countBoardElements = countBoardElements++;



                }

            }
        }


    }

}
