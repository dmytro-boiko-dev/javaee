public enum SizeEnum {
    SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL");

    private String abbreveation;


    //constructor
    SizeEnum(String abbreveation) {
        this.abbreveation = abbreveation;
    }

    public String getAbbreveation() {
        return abbreveation;
    }
}
