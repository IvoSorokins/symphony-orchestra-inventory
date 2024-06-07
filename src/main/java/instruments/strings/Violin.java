package instruments.strings;

public class Violin extends StringsInstrument {

    public Violin(String manufacturer){
        super(manufacturer);
    }

    @Override
    public void play() {
        System.out.println(manufacturer + " violin");
    }
}
