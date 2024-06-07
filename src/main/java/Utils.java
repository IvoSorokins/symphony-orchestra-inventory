//import instruments.sections.StringsSection;
//import instruments.sections.WoodwindsSection;
//import instruments.strings.StringsInstrument;
//import instruments.woodwinds.WoodwindsInstrument;
//import musicians.StringsMusician;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//public class Utils {
//    public static void saveStateToFile(StringsSection strings, WoodwindsSection woodwinds, List<StringsMusician> stringMusicians) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orchestra_state.txt"))) {
//            writer.write("Instruments and their owners:\n");
//
//            // Write StringsSection instruments and owners
//            for (StringsInstrument instrument : strings.getInstruments()) {
//                writer.write(instrument.getId() + " - " + instrument.getManufacturer() + " - " + (instrument.isAvailable() ? "Available" : "Taken") + "\n");
//            }
//
//            // Write WoodwindsSection instruments and owners
//            for (WoodwindsInstrument instrument : woodwinds.getInstruments()) {
//                writer.write(instrument.getId() + " - " + instrument.getManufacturer() + " - " + (instrument.isAvailable() ? "Available" : "Taken") + "\n");
//            }
//
//            writer.write("\nAvailable Instruments:\n");
//
//            // Write available instruments from StringsSection
//            for (StringsInstrument instrument : strings.getInstruments()) {
//                if (instrument.isAvailable()) {
//                    writer.write(instrument.getId() + " - " + instrument.getManufacturer() + "\n");
//                }
//            }
//
//            // Write available instruments from WoodwindsSection
//            for (WoodwindsInstrument instrument : woodwinds.getInstruments()) {
//                if (instrument.isAvailable()) {
//                    writer.write(instrument.getId() + " - " + instrument.getManufacturer() + "\n");
//                }
//            }
//
//            writer.write("\nOrchestra Playing:\n");
//        }
//        // Orchestra playing music
//        strings.play();
//        woodwinds.play();
//
//    } catch (IOException e)
//
//    {
//        System.err.println("Error while saving orchestra state: " + e.getMessage());
//    }
//}
