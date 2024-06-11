package musicians;


import instruments.Instrument;
import instruments.woodwinds.WoodwindsInstrument;

public class WoodwindsMusician extends Musician {

    public WoodwindsMusician(String name) {
        super(name);
    }

    @Override
    public void takeInstrument(Instrument instrument) {
        if (instrument instanceof WoodwindsInstrument) {
            WoodwindsInstrument woodwindsInstrument = (WoodwindsInstrument) instrument;
            if (woodwindsInstrument.isAvailable()) {
                this.instrumentID = woodwindsInstrument.getID();
                woodwindsInstrument.setAvailable(false);
            } else {
                throw new IllegalArgumentException("Instrument is already taken.");
            }
        }
    }
}
