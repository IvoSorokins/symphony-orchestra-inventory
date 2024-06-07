package instruments.sections;

import instruments.Instrument;
import instruments.strings.StringsInstrument;

import java.util.ArrayList;
import java.util.List;

public class StringsSection extends Section {
    private List<Instrument> instruments;
    public StringsSection(){
        super("strings section");
        instruments = new ArrayList<>();
    }

    public <T extends StringsInstrument> void addInstrument(T instrument) {
        instruments.add(instrument);
    }

    @Override
    public void play(){
        super.play();
        System.out.println(" following string instruments:");
    }
}
