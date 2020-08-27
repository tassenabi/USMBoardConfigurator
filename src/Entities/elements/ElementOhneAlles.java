package Entities.elements;

public class ElementOhneAlles extends AbstractElement {

    public static String name = "Strukturelement";
    public static String path = "src/resources/elementIcons/OhneAlles.png";


    ElementOhneAlles(){
        super.hatElementeSeiten = false;
        super.hatElementHinten = false;
        super.hatElementOben = false;

    }

}
