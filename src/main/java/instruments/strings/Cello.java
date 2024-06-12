package instruments.strings;

/**
 * Class representing a cello
 */
public class Cello extends StringsInstrument {
    public Cello(String manufacturer){
        super(manufacturer);
    }


    @Override
    public void play() {
        System.out.println("..." + getManufacturer() + " Cello");
    }
}
