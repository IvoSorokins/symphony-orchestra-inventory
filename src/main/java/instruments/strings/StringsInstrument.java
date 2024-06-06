package instruments.strings;

import instruments.Instrument;

public abstract class StringsInstrument implements Instrument {
    protected String manufacturer;
    protected String id;
    protected boolean isAvailable;

    public static final String ID_PREFIX = "STRINGS-";
}
