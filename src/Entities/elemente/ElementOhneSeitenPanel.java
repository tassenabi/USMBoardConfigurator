package Entities.elemente;

public class ElementOhneSeitenPanel extends AbstractElement {

    public static String name = "Ohne Seitenpanel";
    public static String path = "src/resources/elementIcons/OhneSeitenPanel.png";


    public ElementOhneSeitenPanel(){

        super.hatElementeSeiten = false;
        super.hatElementHinten = false;
        super.hatElementOben = true;

    }
}
