package instruments.strings;

/**
 * Class representing a violin
 */
public class Violin extends StringsInstrument {
    public Violin(String manufacturer){
        super(manufacturer);
    }


    @Override
    public void play() {
        System.out.println("..." + getManufacturer() + " violin");
    }
}
