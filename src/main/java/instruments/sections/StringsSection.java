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

    public List<StringsInstrument> getInstruments() {
        return instruments;
    }

    public void printAvailableInstruments() {
        instruments.stream()
                .filter(StringsInstrument::isAvailable)
                .forEach(instrument -> System.out.println(instrument.getID() + " - " + instrument.getManufacturer()));
    }

    @Override
    public void play(){
        super.play();
        System.out.println("\nFollowing String instruments:");
        instruments.forEach(instrument -> {
            System.out.print("Playing music with ");
            instrument.play();
        });
    }
}
