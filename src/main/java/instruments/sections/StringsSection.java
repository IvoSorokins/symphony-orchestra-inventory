package instruments.sections;

import instruments.strings.StringsInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the strings section of the orchestra
 */
public class StringsSection extends Section {
    private final List<StringsInstrument> instruments;
    public StringsSection(){
        super("Strings section");
        this.instruments = new ArrayList<>();
    }

    /**
     * Add an instrument to the strings section.
     *
     * @param instrument the instrument to add
     */
    public <T extends StringsInstrument> void addInstrument(T instrument) {
        instruments.add(instrument);
    }

    public List<StringsInstrument> getInstruments() {
        return instruments;
    }

    /**
     * Print all available instruments in the strings section using lambda expression
     */
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
