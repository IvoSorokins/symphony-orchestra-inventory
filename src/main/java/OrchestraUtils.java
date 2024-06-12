import instruments.strings.StringsInstrument;
import instruments.woodwinds.WoodwindsInstrument;
import musicians.Musician;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Utility class for Orchestra related operations
 */
public class OrchestraUtils {

    /**
     * Get the name of the musician by the instrument ID
     *
     * @param musicians List of musicians
     * @param instrumentID ID of the instrument
     * @return Name of the musician or "Unknown"
     */
    private static String getMusicianNameByID(List<? extends Musician> musicians, String instrumentID) {
        for (Musician musician : musicians) {
            if (instrumentID.equals(musician.getInstrumentID())) {
                return musician.getName();
            }
        }
        return "Unknown";
    }

    /**
     * Save the list of instruments and their owners to a file
     *
     * @param stringsMusicians List of string musicians
     * @param woodwindsMusicians List of woodwind musicians
     * @param stringsInstruments List of string instruments
     * @param woodwindsInstruments List of woodwind instruments
     * @param filename Name of the file
     */
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
