import instruments.strings.*;
import instruments.woodwinds.*;
import instruments.sections.*;
import musicians.StringsMusician;
import musicians.WoodwindsMusician;
import java.util.ArrayList;
import java.util.List;


public class Orchestra {
    public static void main(String[] args) {
        // Create sections
        StringsSection strings = new StringsSection();
        WoodwindsSection woodwinds = new WoodwindsSection();

        // Add instruments to sections
        strings.addInstrument(new Violin("Stradivari"));
        strings.addInstrument(new Cello("Yamaha"));
        strings.addInstrument(new Violin("Knilling"));
        strings.addInstrument(new Violin("Stentor"));


        woodwinds.addInstrument(new Flute("Emerson"));
        woodwinds.addInstrument(new Flute("Pearl"));

        // String Musicians
        List<StringsMusician> stringsMusicians = new ArrayList<>();
        stringsMusicians.add(new StringsMusician("Janka"));
        stringsMusicians.add(new StringsMusician("Zigis"));

        // Woodwind Musicians
        List<WoodwindsMusician> woodwindsMusicians = new ArrayList<>();
        woodwindsMusicians.add(new WoodwindsMusician("Jariks"));
        woodwindsMusicians.add(new WoodwindsMusician("Kristaps"));

        // Assigning instruments to musicians
        stringsMusicians.get(0).takeInstrument(strings.getInstruments().get(0)); // Janka
        stringsMusicians.get(1).takeInstrument(strings.getInstruments().get(1));// Zigis

        woodwindsMusicians.get(1).takeInstrument(woodwinds.getInstruments().get(0)); // Kristaps

        // Print available instruments
        System.out.println("Available instruments in Strings Section:");
        strings.printAvailableInstruments();
        System.out.println("\nAvailable instruments in Woodwinds Section:");
        woodwinds.printAvailableInstruments();

        OrchestraUtils.saveInstrumentsToFile(stringsMusicians, woodwindsMusicians,strings.getInstruments(),woodwinds.getInstruments(), "Inventory");

        // Play Music
        strings.play();
        woodwinds.play();


    }
}

