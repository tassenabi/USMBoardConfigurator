package Entities.sizes;

public enum Laenge {

        ONE(250),
        TWO( 350),
        THREE(395),
        FOUR(500),
        FIVE(750);

        private int inCcm;

        Laenge(int ccm)
        {
                this.inCcm = ccm;
        }

        public String getValue(){
                return (this.inCcm + "cmm");
        }
}
