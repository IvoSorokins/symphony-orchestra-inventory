package instruments.sections;

import instruments.woodwinds.WoodwindsInstrument;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the strings section of the orchestra
 */
public class WoodwindsSection extends Section {
    private final List<WoodwindsInstrument> instruments;

    public WoodwindsSection(){
        super("Woodwinds section");
        this.instruments = new ArrayList<>();
    }

    /**
     * Add an instrument to the woodwinds section.
     *
     * @param instrument the instrument to add
     */
    public <T extends WoodwindsInstrument> void addInstrument(T instrument) {
        instruments.add(instrument);
    }

    public List<WoodwindsInstrument> getInstruments() {
        return instruments;
    }

    /**
     * Print all available instruments in the woodwinds section using lambda expression
     */
    public void printAvailableInstruments() {
        instruments.stream()
                .filter(WoodwindsInstrument::isAvailable)
                .forEach(instrument -> System.out.println(instrument.getID() + " - " + instrument.getManufacturer()));
    }

    @Override
    public void play(){
        super.play();
        System.out.println("\nFollowing Woodwinds instruments:");
        instruments.forEach(instrument -> {
            System.out.print("Playing music with ");
            instrument.play();
        });
    }
}

