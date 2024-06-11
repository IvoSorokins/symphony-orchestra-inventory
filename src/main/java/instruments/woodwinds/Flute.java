package instruments.woodwinds;

public class Flute extends WoodwindsInstrument {

    public Flute(String manufacturer){
        super(manufacturer);
    }
    @Override
    public void play() {
        System.out.println("..." + getManufacturer() + " flute");
    }
}
