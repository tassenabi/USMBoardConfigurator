package Entities.sizes;

public enum Tiefe {

    ONE(250),
    TWO(350),
    THREE(500);

    private int inCcm;

    Tiefe(int ccm)
    {
        this.inCcm = ccm;
    }

    public String getValue(){
        return (this.inCcm + "cmm");
    }
}
