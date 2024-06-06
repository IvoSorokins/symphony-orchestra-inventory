package instruments.strings;

import instruments.Instrument;

import java.util.UUID;

public abstract class StringsInstrument implements Instrument {
    protected String manufacturer;
    protected String id;
    protected boolean isAvailable;

    public static final String ID_PREFIX = "STRINGS-";

    public StringsInstrument(String manufacturer){
        this.manufacturer = manufacturer;
        this.id = ID_PREFIX + UUID.randomUUID().toString();
        this.isAvailable = true;
    }


}
