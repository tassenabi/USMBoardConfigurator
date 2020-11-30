package validator;

import Entities.SingleBoardElement;

public class ElementValidator {

    private boolean areElementsValid = false;
    private boolean areSizesValid = false;
    private boolean areZubehoerValid = false;

    public boolean validateElements(SingleBoardElement[] allBoardElements){

        AreSizesFine(allBoardElements);
        areZubehoerValid(allBoardElements);

        if(areSizesValid && areZubehoerValid){
            areElementsValid = true;


        } else {
            areElementsValid = false;
        }

        return areElementsValid;
    }



    private void AreSizesFine(SingleBoardElement[] allBoardElements){

        areSizesValid = true;
    }

    private void areZubehoerValid(SingleBoardElement[] allBoardElements){

        areZubehoerValid = true;
    }
}