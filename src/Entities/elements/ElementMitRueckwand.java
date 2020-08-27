package Entities.elements;

public class ElementMitRueckwand extends AbstractElement {

    public static String name = "Mit Rückwand";
    public static String path = "src/resources/elementIcons/MitRueckwand.png";


    public ElementMitRueckwand(){

        super.hatElementHinten = true;
        super.hatElementeSeiten = true;
        super.hatElementOben = true;

    }



}
