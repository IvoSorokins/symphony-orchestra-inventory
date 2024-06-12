package instruments.sections;


import instruments.woodwinds.WoodwindsInstrument;
import java.util.ArrayList;
import java.util.List;


public class WoodwindsSection extends Section {
    private final List<WoodwindsInstrument> instruments;

    public WoodwindsSection(){
        super("Woodwinds section");
        this.instruments = new ArrayList<>();
    }

    public <T extends WoodwindsInstrument> void addInstrument(T instrument) {
        instruments.add(instrument);
    }

    public List<WoodwindsInstrument> getInstruments() {
        return instruments;
    }

    public void printAvailableInstruments() {
        instruments.stream()
                .filter(WoodwindsInstrument::isAvailable)
                .forEach(instrument -> System.out.println(instrument.getID() + " - " + instrument.getManufacturer()));
    }

    @Override
    public void play(){
        super.play();
        System.out.print("Following Woodwinds instruments:");
    }
}
