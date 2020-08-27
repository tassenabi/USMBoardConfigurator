package Entities.sizes;

public enum Hoehe {

    ONE(100),
    TWO( 175),
    THREE(250),
    FOUR(350),
    FIVE(395),
    SIX(500);

    private int inCcm;

    Hoehe(int ccm)
    {
        this.inCcm = ccm;
    }

    public String getValue(){
        return (this.inCcm + "cmm");
    }
}
