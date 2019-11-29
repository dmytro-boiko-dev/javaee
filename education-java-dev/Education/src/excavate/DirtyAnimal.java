package excavate;

public class DirtyAnimal {

    protected static final String THRASH = "Metallica";
    private static final String HARDROCK = "AC/DC";
    private static final String ALTERNATIVE = "Linkin Park";


    public static final String music(){
        return "Loud!";
    }

    public static void main(String[] args) {
        System.out.println(THRASH);
        System.out.println(HARDROCK);
        System.out.println(ALTERNATIVE);
    }


}
