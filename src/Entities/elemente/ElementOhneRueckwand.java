package Entities.elemente;

public class ElementOhneRueckwand extends AbstractElement{

    public static String name = "Ohne Rückwand";
    public static String path = "src/resources/elementIcons/OhneRueckwand.png";


    public ElementOhneRueckwand(){

        super.hatElementeSeiten = true;
        super.hatElementHinten = false;
        super.hatElementOben = true;

    }
}
