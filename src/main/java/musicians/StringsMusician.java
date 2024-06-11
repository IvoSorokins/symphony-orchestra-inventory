package musicians;

import instruments.Instrument;
import instruments.strings.StringsInstrument;


public class StringsMusician extends Musician {
    public StringsMusician(String name) {
        super(name);
    }


    @Override
    public void takeInstrument(Instrument instrument) {
        if (instrument instanceof StringsInstrument) {
            StringsInstrument stringInstrument = (StringsInstrument) instrument;
            if (stringInstrument.isAvailable()) {
                this.instrumentID = stringInstrument.getID();
                stringInstrument.setAvailable(false);
            } else {
                throw new IllegalArgumentException("Instrument is already taken.");
            }
        } else {
            throw new IllegalArgumentException("Only string instruments are allowed.");
        }
    }
}

