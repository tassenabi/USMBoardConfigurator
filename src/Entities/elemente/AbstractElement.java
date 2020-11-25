package Entities.elemente;

public abstract class AbstractElement {

    public boolean hatElementOben;
    public boolean hatElementeSeiten;
    public boolean hatElementHinten;
    public boolean hatKlapptuer;
    public boolean hatAusziehtuer;
    public boolean hatAusziehtuerMitEinlegerahmen;
    public boolean hatEinschubtuer;

    public AbstractElement(){
        hatElementOben = true;
        hatElementeSeiten = true;
        hatElementHinten = true;
        hatKlapptuer = false;
        hatAusziehtuer = false;
        hatAusziehtuerMitEinlegerahmen = false;
        hatEinschubtuer = false;
    }
}
