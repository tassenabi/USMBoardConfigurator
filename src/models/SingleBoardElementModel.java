package models;

import Entities.sizes.Hoehe;
import Entities.sizes.Laenge;
import Entities.SingleBoardElement;
import Entities.sizes.Tiefe;

public class SingleBoardElementModel {

    private SingleBoardElement singleBoardElement;

    private int xPosition;
    private int yPosition;

    public SingleBoardElementModel(int xPosition, int yPosition){

        singleBoardElement = new SingleBoardElement();
        this.xPosition = xPosition;
        this.yPosition = yPosition;

    }

    public int getLaenge(){

        return singleBoardElement.getBoardElementLaenge();
    }

    public int getTiefe(){

        return singleBoardElement.getBoardElementTiefe();
    }

    public int getHoehe(){

        return singleBoardElement.getBoardElementHoehe();
    }

    public int getxPosition(){

        return this.xPosition;
    }

    public int getyPosition(){

        return this.xPosition;
    }

    public void setxPosition(int newXPosition){

        this.xPosition = newXPosition;
    }

    public void setyPosition(int newYPosition){

        this.yPosition = newYPosition;
    }

    public void setBoardElementLaenge(Laenge newLaenge){

        singleBoardElement.setBoardElementLaenge(newLaenge);
    }

    public void setBoardElementHoehe(Hoehe newHoehe){

        this.setBoardElementHoehe(newHoehe);
    }

    public void setBoardElementTiefe(Tiefe newTiefe){

        this.setBoardElementTiefe(newTiefe);
    }

    @Override
    public String toString(){

        return "Tiefe: " + this.getTiefe() + ", Hoehe: " + this.getHoehe() + ", Laenge: " + this.getLaenge() + ", XPosition: " + getxPosition() + ", YPosition: " + getyPosition();
    }
}