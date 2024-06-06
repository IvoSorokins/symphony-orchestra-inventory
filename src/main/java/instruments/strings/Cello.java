package instruments.strings;

public class Cello extends StringsInstrument {

    public Cello(String manufacturer){
        super(manufacturer);
    }
    @Override
    public void play() {
        System.out.println(manufacturer + " Cello");
    }
}
