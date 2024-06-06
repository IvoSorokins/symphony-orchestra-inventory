import instruments.strings.*;
import instruments.woodwinds.*;
import instruments.sections.*;


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
    }
}
