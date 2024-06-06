import instruments.strings.*;
import instruments.woodwinds.*;
import instruments.sections.*;
import musicians.StringsMusician;

import java.util.ArrayList;
import java.util.List;


public class Orchestra {
    public static void main(String[] args) {
        StringsSection strings = new StringsSection();
        WoodwindsSection woodwinds = new WoodwindsSection();


        strings.addInstrument(new Violin("Stradivari"));
        strings.addInstrument(new Cello("Yamaha"));
        strings.addInstrument(new Violin("Knilling"));
        strings.addInstrument(new Violin("Stentor"));


        woodwinds.addInstrument(new Flute("Emerson"));
        woodwinds.addInstrument(new Flute("Pearl"));

        List<StringsMusician> stringsMusicianList = new ArrayList<>();
        stringMusicians.add(new StringsMusician("Janka"));
        stringMusicians.add(new StringsMusician("Zigis"));

        // Print available instruments in StringsSection
        System.out.println("Available instruments in Strings Section:");
        strings.printAvailableInstruments();

        // Print available instruments in WoodwindsSection
        System.out.println("Available instruments in Woodwinds Section:");
        woodwinds.printAvailableInstruments();

        stringMusician.get(0).takeInstrument();



    }
}
