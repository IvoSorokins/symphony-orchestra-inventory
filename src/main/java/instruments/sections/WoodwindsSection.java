package instruments.sections;

import instruments.Instrument;
import instruments.woodwinds.WoodwindsInstrument;

import java.util.ArrayList;
import java.util.List;

public class WoodwindsSection extends Section {
    private List<Instrument> instruments;

    public WoodwindsSection(){
        super("Woodwinds section");
        instruments = new ArrayList<>();
    }

    @Override
    public <T extends Instrument> void addInstrument(T instrument) {
        if (instrument instanceof WoodwindsInstrument) {
            instruments.add(instrument);
        } else {
            throw new IllegalArgumentException("Only woodwind instruments are allowed in StringsSection.");
        }
    }

    @Override
    public void play(){
        super.play();
        System.out.print("following woodwind instruments:");
    }
}
