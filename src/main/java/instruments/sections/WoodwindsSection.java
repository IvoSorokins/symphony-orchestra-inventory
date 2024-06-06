package instruments.sections;

import instruments.Instrument;

import java.util.ArrayList;
import java.util.List;

public class WoodwindsSection extends Section {
    private List<Instrument> instruments;

    public WoodwindsSection(){
        super("Woodwinds section");
        instruments = new ArrayList<>();
    }

    public <T extends Instrument> void addInstrument(T instrument) {
        instruments.add(instrument);

    }

    @Override
    public void play(){
        super.play();
        System.out.println(" following woodwind instruments:");
    }
}
