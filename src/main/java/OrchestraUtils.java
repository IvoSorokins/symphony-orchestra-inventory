import instruments.strings.StringsInstrument;
import instruments.woodwinds.WoodwindsInstrument;
import musicians.Musician;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OrchestraUtils {

    private static String getMusicianNameByID(List<? extends Musician> musicians, String instrumentID) {
        for (Musician musician : musicians) {
            if (instrumentID.equals(musician.getInstrumentID())) {
                return musician.getName();
            }
        }
        return "Unknown";
    }

    // Save list of instruments and their owners to a file
    public static void saveInstrumentsToFile(List<? extends Musician> stringsMusicians, List<? extends Musician> woodwindsMusicians,
                                             List<StringsInstrument> stringsInstruments, List<WoodwindsInstrument> woodwindsInstruments,
                                             String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Strings Section:\n");
            for (StringsInstrument instrument : stringsInstruments) {
                writer.write(instrument.getID() + " - " + instrument.getManufacturer() +
                        (instrument.isAvailable() ? " (Available)\n" :
                                " (Taken by: " + getMusicianNameByID(stringsMusicians, instrument.getID()) + ")\n"));
            }

            writer.write("\nWoodwinds Section:\n");
            for (WoodwindsInstrument instrument : woodwindsInstruments) {
                writer.write(instrument.getID() + " - " + instrument.getManufacturer() +
                        (instrument.isAvailable() ? " (Available)\n" :
                                " (Taken by: " + getMusicianNameByID(woodwindsMusicians, instrument.getID()) + ")\n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
