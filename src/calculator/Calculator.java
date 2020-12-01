package calculator;

import view.masterView.SingleBoardElementView;

public class Calculator {

    //Counts
    private int countAllBoardElements;
    private int countVertikaleBoardElements;
    private int countHoizontaleBoardElements;

    private int countKnaufeOderSchloss;

    public Calculator(){

    }

    public void calculate(SingleBoardElementView[][] allElementsViews){

        this.resetNumbers();

        for (int zeile = 0; zeile< allElementsViews.length; zeile++){

            for(int spalte = 0; spalte< allElementsViews[zeile].length; spalte++){

                countAllActiveElements(allElementsViews, zeile, spalte);

                /**
                 *  if(zeile == 0 && !allElementsViews[zeile][spalte].
                 *                         getElementActiveComboBox()
                 *                         .getModel()
                 *                         .getSelectionModel()
                 *                         .getSelectedItem().equals("")){
                 *                     countVertikaleBoardElements = countHoizontaleBoardElements +1;
                 *                     System.out.println("hor:" + countHoizontaleBoardElements);
                 *                 }
                 */

            }
        }


    }

    private void countAllActiveElements(SingleBoardElementView[][] allElementsViews, int zeile, int spalte) {
        //Anzahl aktiv ausgewaehlter BoardElemente
        if(!allElementsViews[zeile][spalte].
                getElementActiveComboBox()
                .getModel()
                .getSelectionModel()
                .getSelectedItem().equals("")){

            countAllBoardElements = countAllBoardElements+1;
            System.out.println(zeile +" / " + spalte);

        }
    }

    private void resetNumbers() {

        this.countAllBoardElements = 0;
        this.countVertikaleBoardElements = 0;
        this.countHoizontaleBoardElements = 0;
    }

}
