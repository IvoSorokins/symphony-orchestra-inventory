package instruments.sections;

import instruments.strings.StringsInstrument;
import java.util.ArrayList;
import java.util.List;


public class StringsSection extends Section {
    private final List<StringsInstrument> instruments;
    public StringsSection(){
        super("Strings section");
        this.instruments = new ArrayList<>();
    }

    public <T extends StringsInstrument> void addInstrument(T instrument) {
        instruments.add(instrument);
    }

    public void printAvailableInstruments() {
        instruments.stream()
                .filter(StringsInstrument::isAvailable)
                .forEach(instrument -> System.out.println(instrument.getID() + " - " + instrument.getManufacturer()));
    }

    @Override
    public void play(){
        super.play();
        System.out.print(" following string instruments:");
    }
}
