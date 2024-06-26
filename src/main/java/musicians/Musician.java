package musicians;

import instruments.Instrument;

/**
 * Abstract class representing a musician
 */

public abstract class Musician {
    protected String name;
    protected String instrumentID;

    public Musician(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getInstrumentID(){
        return instrumentID;
    }

    public abstract void takeInstrument(Instrument instrument);
}


