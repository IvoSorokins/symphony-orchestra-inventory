package instruments.sections;

import instruments.Instrument;
import instruments.strings.StringsInstrument;


public class StringsSection extends Section {
    public StringsSection(){
        super("strings section");
    }

    @Override
    public <T extends Instrument> void addInstrument(T instrument) {
        if (instrument instanceof StringsInstrument) {
        instruments.add(instrument);
        } else {
        throw new IllegalArgumentException("Only string instruments are allowed in StringsSection.");
        }
    }

    @Override
    public void play(){
        super.play();
        System.out.print(" following string instruments:");
    }
}
