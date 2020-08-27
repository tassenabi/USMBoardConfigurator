package Entities;

import Entities.sizes.Hoehe;
import Entities.sizes.Laenge;
import Entities.sizes.Tiefe;

public class SingleBoardElement {

    private int boardElementHoehe;
    private int boardElementLaenge;
    private int boardElementTiefe;

    public SingleBoardElement(){

      setInitialDefaultValues();
    }

    private void setInitialDefaultValues() {

        this.boardElementHoehe = Integer.valueOf(String.valueOf(Hoehe.ONE));
        this.boardElementLaenge = Integer.valueOf(String.valueOf(Laenge.ONE));
        this.boardElementTiefe = Integer.valueOf(String.valueOf(Tiefe.ONE));
    }

    public int getBoardElementLaenge(){

        return this.boardElementLaenge;
    }

    public int getBoardElementHoehe(){

        return this.boardElementHoehe;
    }

    public int getBoardElementTiefe(){

        return this.boardElementTiefe;
    }

    public void setBoardElementLaenge(Laenge newLaenge){

        this.boardElementLaenge = Integer.valueOf(String.valueOf(newLaenge));
    }

    public void setBoardElementHoehe(Hoehe newHoehe){

        this.boardElementHoehe = Integer.valueOf(String.valueOf(newHoehe));
    }

    public void setBoardElementTiefe(Tiefe newTiefe){

        this.boardElementTiefe = Integer.valueOf(String.valueOf(newTiefe));
    }

    @Override
    public String toString(){

        return "Depth: " + this.boardElementTiefe + ", Height: " + this.boardElementHoehe + ", Width: " + this.boardElementLaenge;
    }
}